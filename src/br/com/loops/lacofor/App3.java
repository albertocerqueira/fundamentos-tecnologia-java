package br.com.loops.lacofor;

import java.util.ArrayList;

public class App3 {

	public static void main(String[] args) {
		ArrayList<Integer> listaInteger = new ArrayList<Integer>();
		listaInteger.add(2);
		listaInteger.add(33);
		listaInteger.add(22);
		listaInteger.add(87);

		int soma = 0;
		for (Integer inteiro : listaInteger) {
			soma += inteiro;
		}

		System.out.println("Soma total: " + soma);
	}
}