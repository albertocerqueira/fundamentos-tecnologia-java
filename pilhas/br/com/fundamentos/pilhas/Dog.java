package br.com.fundamentos.pilhas;

public class Dog {

	private String nome;
    private double peso;
    private int agressividade;

    public Dog(double peso , int agressividade) {
        this.peso = peso;
        this.agressividade = agressividade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAgressividade() {
        return agressividade;
    }

    public void setAgressividade(int agressividade) {
        this.agressividade = agressividade;
    }

    public String validaPeso() {// PROIBI CACHORROS ACIMA DO PESO
        if (this.peso>20) {
            return "Cachorro acima do peso.";
        }
        return "";
    }
    
    public String validaAgressividade() {// PROIBI CACHORRO COM AGRESSIVIDADE
        if (this.agressividade>10 || this.agressividade<1) {// ALTA.
            return "Agressividade deve variar de 1 a 10";
        }
        return "";
    }
}