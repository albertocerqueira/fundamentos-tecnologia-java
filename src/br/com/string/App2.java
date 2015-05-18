package br.com.string;

public class App2 {

	public static void main(String[] args) {
		Caracteres carac1 = new Caracteres();
		carac1.setTexto("ABC");
		Caracteres carac2 = carac1;
		carac1.setTexto("A2BC");
		
		if (carac1.equals(carac2)) {
			System.out.println("Somos Iguais.");
		} else {
			System.out.println("Somos Diferentes.");
		}
	}
}