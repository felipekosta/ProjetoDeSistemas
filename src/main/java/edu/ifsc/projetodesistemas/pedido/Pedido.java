package edu.ifsc.projetodesistemas.pedido;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }
    
    public Double valorTotal() {
        Double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getValor() * item.getQuantidade();
        }
        return total;
    }
    
    public void addItem(ItemPedido item) {
        this.itens.add(item);
    }
}
