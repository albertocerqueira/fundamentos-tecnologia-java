package br.com.fundamentos.orientacaoobjeto.derivacaoecomposicao;

public class App {

	public static void main(String[] args) {
		Mesa mesa = new Mesa();
		System.out.println(mesa.pernas.getInfo());
		System.out.println(mesa.tampo.getInfo());
	}
}