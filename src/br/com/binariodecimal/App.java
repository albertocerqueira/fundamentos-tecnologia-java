package br.com.binariodecimal;

public class App {

	public static void main(String[] args) {
		int valor = 12;
		int quociente;
		int resto;

		quociente = valor / 2;
		resto = valor % 2;
		System.out.println(resto);

		while (quociente > 0) {
			resto = quociente % 2;
			quociente = quociente / 2;
			System.out.println(resto);
		}

		String bin = Integer.toString(valor, 2);
		System.out.println(bin);
	}
}