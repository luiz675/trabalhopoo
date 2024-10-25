import java.util.ArrayList;
import java.util.Scanner;
/*
- Encontre o erro e faça a correção - ok
- Construa um menu para melhorar a aplicação - ok
- Seria ideal que cada cliente, produdo e pedido tivessem um codigo único - +-

- Possibilitar o cancelamento do item do Produto, voltando o produto para o estoque
- Possibilitar o cancelamento da venda, voltando o produto para o estoque

*/
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        ItemPedido item = new ItemPedido();

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
        int opcao;

        do {
            System.out.println("***********************************");
            System.out.println("1 - Cadastro de cliente");
            System.out.println("2 - Cadastro de Produto");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Listar  Produto");
            System.out.println("5 - Cadastrar Pedido");
            System.out.println("6 - Listar  Pedido");
            System.out.println("7 - Sair");
            System.out.println("***********************************");
            System.out.println("Escolha uma opção no menu:");
            opcao = scan.nextInt();

            switch (opcao)
            {
                case 1:
                    scan.nextLine();

                    System.out.println("Informe o Nome: ");
                    String nome = scan.nextLine();

                    System.out.println("Informe o CPF: ");
                    String cpf = scan.nextLine();

                    boolean retorno = cliente.cadastrarCliente(nome, cpf);

                    clientes.add(cliente);

                   if(retorno) {
                       System.out.println("Registro efetuado com sucesso");
                   }else {
                       System.out.println("Erro ao registrar o cliente!!!");
                   }
                   break;
                case 2:
                    System.out.println("cadastrar produto");
                    scan.nextLine();

                    System.out.println("informe o nome do produto");
                    String nomeProduto = scan.nextLine();

                    System.out.println("Informe o preço do produto");
                    double precoProduto = scan.nextDouble();

                    System.out.println("Informe o quantidade do produto");
                    int quatidadeProduto = scan.nextInt();

                    Produto produto = new Produto(nomeProduto, precoProduto, quatidadeProduto);

                    produtos.add(produto);

                    break;
                case 3:
                    System.out.println("Listar cliente");

                    for(int i = 0; i < clientes.size(); i++){
                        System.out.println(i + "\t| " + clientes.get(i).getNome() + "\t| " + clientes.get(i).getCpf());
                    }

                break;

                case 4:
                    System.out.println("Listar produtos");
                    System.out.println("CODIGO \t|  PRODUTO \t| PREÇO");
                    for(int i = 0; i < produtos.size(); i++){
                        System.out.println(i + "\t| " + produtos.get(i).getNomeProduto() + "\t| " + produtos.get(i).getPrecoProduto());
                        /*System.out.println("\nProduto: " + i);
                        System.out.println("Nome: " + produtos.get(i).getNomeProduto());
                        System.out.println("Preço: " + produtos.get(i).getPrecoProduto());*/
                    }
                break;

                case 5:
                    System.out.println("********************* CADASTRO DE PEDIDOS***********************");

                    System.out.println("Clientes cadastrados");

                    System.out.println("CODIGO \t| CLIENTE \t| CPF");
                    for(int i = 0; i < clientes.size(); i++){
                        System.out.println(i + "\t| " + clientes.get(i).getNome() + "\t| " + clientes.get(i).getCpf());
                    }

                    System.out.println("Selecione o cliente: ");
                    int codigoCliente = scan.nextInt();

                    System.out.println("Informe um coódigo para o pedido: ");
                    int numeroPedido = scan.nextInt();

                    Pedido pedido = new Pedido(clientes.get(codigoCliente), numeroPedido);
                    pedidos.add(pedido);

                    Pedido codigoPedido =  pedidos.getLast();

                    //adicionar produtos no ItemPedido
                    System.out.println("Listar produtos");

                    System.out.println("CODIGO \t|  PRODUTO \t| PREÇO");
                    for(int i = 0; i < produtos.size(); i++){
                        System.out.println(i + "\t| " + produtos.get(i).getNomeProduto() + "\t| " + produtos.get(i).getPrecoProduto());
                        /*System.out.println("\nProduto: " + i);
                        System.out.println("Nome: " + produtos.get(i).getNomeProduto());
                        System.out.println("Preço: " + produtos.get(i).getPrecoProduto());*/
                    }

                    System.out.println("Informe um código do produto: ");
                    int codigoProduto = scan.nextInt();

                    Produto codProduto = produtos.get(codigoProduto);

                    System.out.println("Informe a quantidade do produto: ");
                    int quantidadeProduto = scan.nextInt();

                    System.out.println("Informe o preço a pagar: ");
                    double precoPagar = scan.nextDouble();

                    if (item.ItensPedido(codigoPedido, codProduto, quantidadeProduto, precoPagar)) {
                        itens.add(item);
                        System.out.println("Produto Inserido com sucesso!");
                    } else {
                        System.out.println("Quantidade Insuficiente do produto!");
                    }

                    break;
                case 6:
                    System.out.println("Listar pedidos");
                    for (ItemPedido iten : itens) {
                        iten.mostrarItemPedido();
                        System.out.println("--------------");
                    }

                    break;

                case 7:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Valor não condiz com o esperado!!!");
            }
        } while (opcao != 7); ;
    }
}