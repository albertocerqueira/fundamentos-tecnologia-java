package br.com.fundamentos.filas;

public class Carro {
    private String modelo;

    /*
     * Existe 2 construtores nesta classe para
     * estanciamentos em fins diferentes.
     */
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
/*
 * Algumas metodos estão comentados porque foram
 * implementados errados.
 */