package edu.ifsc.projetodesistemas.jogodetabuleiro;

public class Dado {
    private int numeroAtual;

    public int getNumeroAtual() {
        return numeroAtual;
    }

    public void setNumeroAtual(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
    
    public Dado() {
        rolar();
    }
    
    public Integer rolar() {
        this.numeroAtual = (int)(Math.random() * 6) + 1;
        return this.numeroAtual;
    }
}
