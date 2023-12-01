package minimercado;

public class Produto {
    private String nomeProduto, descProduto;
    private double precoProduto;
    private int estoqueAtual;
    private Categoria categoria;

    Produto() {
    }

    private Produto(String nomeProduto, String descProduto, double precoProduto, int estoqueAtual,
                    Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
    }

    public String getNomeProduto() {

        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {

        return this.descProduto;
    }

    public void setDescProduto(String descProduto) {

        this.descProduto = descProduto;
    }

    public double getPrecoProduto() {

        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getEstoqueAtual() {

        return this.estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {

        this.estoqueAtual = estoqueAtual;
    }

    public void atualizarEstoque(int quantidadeDeSaida) {
        int estoqueAtual = this.getEstoqueAtual();

        estoqueAtual -= quantidadeDeSaida;

        this.setEstoqueAtual(estoqueAtual);
    }

    public Categoria getCategoria() {

        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {

        this.categoria = categoria;
    }

    public Produto inserirProduto(String nomeProduto, String descProduto, double precoProduto, int estoqueAtual,
                                  Categoria categoria) {
        return new Produto(nomeProduto, descProduto, precoProduto, estoqueAtual, categoria);
    }

    public boolean buscarProduto(String nomeProduto) {

        return this.getNomeProduto().equals(nomeProduto);
    }

}

