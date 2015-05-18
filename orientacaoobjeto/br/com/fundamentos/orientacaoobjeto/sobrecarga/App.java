package br.com.fundamentos.orientacaoobjeto.sobrecarga;

public class App {

	public static void main(String[] args) {
		Calculos calc = new Calculos();
		int valor = calc.calcular(2);
		System.out.println(valor);
		
		valor = calc.calcular(2, 2);
		System.out.println(valor);
		
		valor = calc.calcular(2, 2, "soma");
		System.out.println(valor);
	}
}