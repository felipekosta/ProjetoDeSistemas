package edu.ifsc.projetodesistemas.jogodetabuleiro;
import javax.swing.JOptionPane;

public class Jogo {
    private Tabuleiro meuTabuleiro;
    private Dado meuDado;
    private Jogador[] meusJogadores;
    private int proximoJogador;
    
    public Jogo(int numeroJogadores, int numeroCasas) {
        this.meuTabuleiro = new Tabuleiro(numeroCasas);
        this.meuDado = new Dado();
        this.meusJogadores = new Jogador[numeroJogadores];
        for (int i = 0; i < this.meusJogadores.length; i++) {
            this.meusJogadores[i] = new Jogador(i + 1);
        }
        this.proximoJogador = 0;
    }
    
    public void proximaJogada() {
        Jogador jogadorAtual = getMeusJogadores()[getProximoJogador()];
        jogadorAtual.jogar(getMeuDado());
        
        if (jogadorAtual.getCasaAtual() > getMeuTabuleiro().getNumeroCasas()) {
            JOptionPane.showMessageDialog(null, "O Jogador " 
                    + jogadorAtual.getMeuNumero() + " venceu!");
        }
        
        setProximoJogador(getProximoJogador() + 1);
        if (getProximoJogador() >= getMeusJogadores().length) {
            setProximoJogador(0);
        }
    }
    
    @Override
    public String toString() {
        String tabuleiro = " ";
        String vazia = "";
        for (int i = 0; i < getMeuTabuleiro().getNumeroCasas(); i++) {
            tabuleiro += "=";
            vazia += "_";
        }
        
        String retorno = tabuleiro + "\n";
        for (Jogador jogador : getMeusJogadores()) {
            String jogadorTabuleiro = jogador.getMeuNumero() + vazia;
            StringBuilder sb = new StringBuilder(jogadorTabuleiro);
      
            if (jogador.getCasaAtual()  < getMeuTabuleiro().getNumeroCasas())
                sb.setCharAt(jogador.getCasaAtual() + 1, 'X');
            else
                sb.setCharAt(getMeuTabuleiro().getNumeroCasas(), 'X');
            retorno += sb + "\n";
        }
        return retorno;
    }

    /**
     * @return the meuTabuleiro
     */
    public Tabuleiro getMeuTabuleiro() {
        return meuTabuleiro;
    }

    /**
     * @param meuTabuleiro the meuTabuleiro to set
     */
    public void setMeuTabuleiro(Tabuleiro meuTabuleiro) {
        this.meuTabuleiro = meuTabuleiro;
    }

    /**
     * @return the meuDado
     */
    public Dado getMeuDado() {
        return meuDado;
    }

    /**
     * @param meuDado the meuDado to set
     */
    public void setMeuDado(Dado meuDado) {
        this.meuDado = meuDado;
    }

    /**
     * @return the meusJogadores
     */
    public Jogador[] getMeusJogadores() {
        return meusJogadores;
    }

    /**
     * @param meusJogadores the meusJogadores to set
     */
    public void setMeusJogadores(Jogador[] meusJogadores) {
        this.meusJogadores = meusJogadores;
    }

    /**
     * @return the proximoJogador
     */
    public int getProximoJogador() {
        return proximoJogador;
    }

    /**
     * @param proximoJogador the proximoJogador to set
     */
    public void setProximoJogador(int proximoJogador) {
        this.proximoJogador = proximoJogador;
    }
    
}
