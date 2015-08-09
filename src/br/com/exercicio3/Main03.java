package br.com.exercicio3;

public class Main03 {

	public static void main(String[] args) {
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: " + valor);
	}

	// public static void main(String[] args) {
	// Cachorro cachorro = new Cachorro();
	// Boolean valor = cachorro instanceof ChowChow;
	// System.out.println("Verdadeiro ou Falso: " + valor);
	// }
}