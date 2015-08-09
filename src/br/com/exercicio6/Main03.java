package br.com.exercicio6;

public class Main03 {

	public static void main(String[] args) {
		for (Cores cor : Cores.values()) {
			System.out.println("Cor: " + cor.getNome() + " código " + cor.getCodigo());
		}
		System.out.println("-------------------GET Cor-------------------");
		System.out.println("Cor: " + Cores.get(21));
		System.out.println("Cor: " + Cores.get("Branco"));
	}
}