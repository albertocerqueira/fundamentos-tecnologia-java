package br.com.exercicio1;

public class Automovel {
    
    public Automovel(String cor, String fabricante, String modelo, Boolean flex, String motor, int valor) {
        this.cor = cor;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.flex = flex;
        this.motor = motor;
        this.valor = valor;
    }
    
    private String cor;
    private String fabricante;
    private String modelo;
    private Boolean flex;
    private String motor;
    private int valor;

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the flex
     */
    public Boolean getFlex() {
        return flex;
    }

    /**
     * @param flex the flex to set
     */
    public void setFlex(Boolean flex) {
        this.flex = flex;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public static void main(String[] args) {
        Automovel a = new Automovel("Verde", "GM", "Turbo", true, "R7", 80000);
        a.ligar();
        a.desligar();
    }
    
    public void ligar() {
        System.out.println("Motor Ligar");
        System.out.println("Vrummmmmmmmmmmmm");
        System.out.println("Vrummmmmm");
        System.out.println("Vrummmmmmmmmmmmmmmmmmmmmmmmm");
    }
    
    public void desligar() {
        System.out.println("Motor Desligado");
    }
}