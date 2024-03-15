package edu.ifsc.projetodesistemas.jogodetabuleiro;

public class Jogador {

    private int casaAtual;
    private int meuNumero;

    public Jogador (int numero) {
        this.casaAtual = 0;
        this.meuNumero = numero;
    }
    
    public void jogar(Dado dado) {
        dado.rolar();
        setCasaAtual(getCasaAtual() + dado.getNumeroAtual());
    }
    
    public int getMeuNumero() {
        return this.meuNumero;
    }

    public void setMeuNumero(int meuNumero) {
        this.meuNumero = meuNumero;
    }

    public int getCasaAtual() {
        return casaAtual;
    }

    public void setCasaAtual(int casaAtual) {
        this.casaAtual = casaAtual;
    }
    
}
