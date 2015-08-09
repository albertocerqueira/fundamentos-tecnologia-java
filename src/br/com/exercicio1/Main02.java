package br.com.exercicio1;

public class Main02 {
	
    /**
     * Eh possivel perde a precisao no calculo
     */
    public static void main(String[] args) {
        float a = 7;
        int b = 2;
        b = a / b;
        System.out.println(b);
    }
}