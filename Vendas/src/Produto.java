public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public Produto() {
    }

    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Preço Produto: " + getPrecoProduto());
        System.out.println("Quantidade: " + getQuantidadeProduto());
    }
}
