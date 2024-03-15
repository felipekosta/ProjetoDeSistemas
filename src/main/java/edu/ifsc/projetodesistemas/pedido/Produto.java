package edu.ifsc.projetodesistemas.pedido;

public class Produto {
    private static Integer codigo = 0;
    private String descricao;
    private Double valor;

    public Produto(String descricao, Double valor) {
        this.codigo++;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
