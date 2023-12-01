package minimercado;

public class PedidoItem {
    private String nomeItem;
    private int qtdeItem;
    private double precoItem;

    public String getNomeItem() {

        return this.nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdeItem() {

        return this.qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {

        this.qtdeItem = qtdeItem;
    }

    public double getPrecoItem() {

        return this.precoItem;
    }

    public void setPrecoItem(double precoItem) {

        this.precoItem = precoItem;
    }

    public PedidoItem(String nomeItem, int qtdeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
        this.precoItem = precoItem;
    }

    PedidoItem() {
    }

    public void atualizaEstoqueItem(int qtdeItem) {
        this.setQtdeItem(qtdeItem);
    }
}
