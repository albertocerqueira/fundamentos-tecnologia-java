package br.com.varargs;

public class App1 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.media("M\u00e9dia", 1, 33, 566, 22, 111, 223, 33, 222);
	}
}