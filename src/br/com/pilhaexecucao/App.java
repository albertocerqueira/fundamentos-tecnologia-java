package br.com.pilhaexecucao;

public class App {

	public static void main(String[] args) {
		System.out.println("M\u00e9todo main: in\u00edcio");
		metodoA();
		System.out.println("M\u00e9todo main: fim");
	}
	
	public static void metodoA() {
		System.out.println("M\u00e9todo A: in\u00edcio");
		metodoB();
		System.out.println("M\u00e9todo A: fim");
	}
	
	public static void metodoB() {
		System.out.println("M\u00e9todo B: in\u00edcio");
		int[] lista = new int[4];
		for (int i=0; i < 10; i++) {
			System.out.println("Contando " + lista[i]+"...");
		}
		System.out.println("M\u00e9todo B: fim");
	}
}