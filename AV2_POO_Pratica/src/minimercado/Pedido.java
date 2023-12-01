package minimercado;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido, statusPedido;
    private Date dataHoraPedido;
    private Double precoTotal;
    private ArrayList<PedidoItem> pedidoItem;

    public Pedido() {
    }

    public int getNumeroPedido() {

        return this.numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {

        this.numeroPedido = numeroPedido;
    }

    public int getStatusPedido() {

        return this.statusPedido;
    }

    public void setStatusPedido(int statusPedido) {

        this.statusPedido = statusPedido;
    }

    public Date getDataHoraPedido() {

        return this.dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {

        this.dataHoraPedido = dataHoraPedido;
    }

    public Double getPrecoTotal() {

        return this.precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {

        this.precoTotal = precoTotal;
    }

    private Pedido(int numeroPedido, int statusPedido, Date dataHoraPedido, Double precoTotal) {
        this.numeroPedido = numeroPedido;
        this.statusPedido = statusPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.pedidoItem = new ArrayList<PedidoItem>();
    }

    public Pedido inserirPedido(int numeroPedido, int statusPedido, Date dataHoraPedido, Double precoTotal) {
        return new Pedido(numeroPedido, statusPedido, dataHoraPedido, precoTotal);
    }

    public void alterarStatus(int statusPedido) {

        this.setStatusPedido(statusPedido);
    }

    public boolean consultarPedido(Pedido pedido) {

        return pedido.getNumeroPedido() == this.getNumeroPedido();
    }

    public void inserirItensPedido(PedidoItem pedidoItem) {

        this.pedidoItem.add(pedidoItem);
    }

    public void excluirItensPedido(PedidoItem pedidoItem) {
        for (int i = 0; i < this.pedidoItem.size(); i++) {
            PedidoItem item = this.pedidoItem.get(i);

            if (item.getNomeItem().equals(pedidoItem.getNomeItem())) {
                this.pedidoItem.remove(i);
            }
        }
    }

    public Double calculaTotalPagar() {
        Double totalPagar = 0.0;

        for (PedidoItem pedidoItem : this.pedidoItem) {
            totalPagar += pedidoItem.getPrecoItem();
        }

        this.setPrecoTotal(totalPagar);

        return this.getPrecoTotal();
    }
}
