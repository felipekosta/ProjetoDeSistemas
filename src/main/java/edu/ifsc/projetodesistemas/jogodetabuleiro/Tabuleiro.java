package edu.ifsc.projetodesistemas.jogodetabuleiro;

public class Tabuleiro {
    private int numeroCasas;
    
    public Tabuleiro(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    /**
     * @return the numeroCasas
     */
    public int getNumeroCasas() {
        return numeroCasas;
    }

    /**
     * @param numeroCasas the numeroCasas to set
     */
    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }
}
