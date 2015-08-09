package br.com.exercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Aviao extends Thread {
    
    private String nome;
    
    public Aviao(String nome, Aeroporto aeroporto){
        this.nome = nome;
    }
    
    public void decolar(int numero){
        Aeroporto.aguardarPistaDisponivel(nome);
        System.out.println("Decolagem de numero " + numero + " Avião: " + nome);
    }
    
    public void voar() throws InterruptedException{
        Thread.sleep(2000);
    }
    
    public void aterrizar(){
        Aeroporto.aguardarPistaDisponivel(nome);
        System.out.println("Pousando Avião:" + nome);
    }
    
    @Override
    public void run() {
        int qtdVoo = 0;
        while(true){
            qtdVoo++;
            decolar(qtdVoo);
            try {
                voar();
            } catch (InterruptedException ex) {
                System.out.println("Erro no voo do avião.");
            }
            aterrizar();
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}