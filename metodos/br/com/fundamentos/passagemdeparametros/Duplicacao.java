package br.com.fundamentos.passagemdeparametros;

public class Duplicacao {

	public void duplicador(int[] valores) {
		for (int i = 0, s = valores.length; i < s; i++) {
			valores[i] = valores[i] * valores[i];
		}
	}
	
	public void incrementador(int valor) {
		valor++;
	}
}