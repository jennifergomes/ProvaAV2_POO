package minimercado;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Categoria categoria = new Categoria("Categoria Geral");

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

        // INICIO PRODUTOS
        Produto produtoGeral = new Produto();

        Produto produto1 = produtoGeral.inserirProduto("1", "1", 5.50, 100, categoria);

        Produto produto2 = produtoGeral.inserirProduto("2", "2", 5.50, 100, categoria);

        Produto produto3 = produtoGeral.inserirProduto("3", "3", 5.50, 100, categoria);

        Produto produto4 = produtoGeral.inserirProduto("4", "4", 5.50, 100, categoria);

        Produto produto5 = produtoGeral.inserirProduto("5", "5", 5.50, 100, categoria);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        // FIM PRODUTOS

        // INICIO PEDIDOS

        Pedido pedidosGeral = new Pedido();

        PedidoItem pedidoItem1 = new PedidoItem("1", 2, 520);
        PedidoItem pedidoItem2 = new PedidoItem("2", 12, 350);
        PedidoItem pedidoItem3 = new PedidoItem("3", 22, 550);

        Pedido pedido1 = pedidosGeral.inserirPedido(1, 1, new Date(), 5000.0);



        pedido1.inserirItensPedido(pedidoItem1);
        produto1.atualizarEstoque(pedidoItem1.getQtdeItem());

        pedido1.inserirItensPedido(pedidoItem2);
        produto2.atualizarEstoque(pedidoItem2.getQtdeItem());

        pedido1.inserirItensPedido(pedidoItem3);
        produto3.atualizarEstoque(pedidoItem3.getQtdeItem());

        pedido1.setStatusPedido(2);

        Pedido pedido2 = pedidosGeral.inserirPedido(2, 1, new Date(), 5000.0);

        pedido2.inserirItensPedido(pedidoItem1);
        produto1.atualizarEstoque(pedidoItem1.getQtdeItem());

        pedido2.inserirItensPedido(pedidoItem2);
        produto2.atualizarEstoque(pedidoItem2.getQtdeItem());

        pedido2.inserirItensPedido(pedidoItem3);
        produto3.atualizarEstoque(pedidoItem3.getQtdeItem());

        pedido2.setStatusPedido(2);

        pedidos.add(pedido1);
        pedidos.add(pedido2);

        Double totalPedido1 = pedido1.calculaTotalPagar();
        Double totalPedido2 = pedido2.calculaTotalPagar();

        // FIM PEDIDO

        System.out.println("Total pedido 1: " + totalPedido1);
        System.out.println("Total pedido 2: " + totalPedido2);
    }
}
