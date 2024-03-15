package edu.ifsc.projetodesistemas.pedido;

public class SistemaPedidos {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Produto prod = new Produto("martelo", 25.0);
        ItemPedido item = new ItemPedido(prod, 2);
        pedido.addItem(item);
        
        prod = new Produto("Alicate", 45.0);
        item = new ItemPedido(prod, 3);
        pedido.addItem(item);
        
        System.out.println("Total do pedido: " + pedido.valorTotal());
    }
    
}
