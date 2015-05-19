package br.com.varargs;

public class Calculadora {

	public void media(String nome, int... valores) {
		float media = 0;
		for (int i = 0; i < valores.length; i++) {
			media += valores[i];
		}

		media = media / valores.length;
		System.out.println(nome + " " + media);
	}
}