import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Pedido> pedido;

    public Cliente() {
        this.pedido = new ArrayList<>();
    }
    public boolean cadastrarCliente(String nome, String cpf){
        this.setNome(nome);
         this.setCpf(cpf);

        return true;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraClie(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }
}


