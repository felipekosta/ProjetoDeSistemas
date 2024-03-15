package edu.ifsc.projetodesistemas.pedido;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemPedido(Produto produto, int qtd) {
        this.produto = produto;
        this.quantidade = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
