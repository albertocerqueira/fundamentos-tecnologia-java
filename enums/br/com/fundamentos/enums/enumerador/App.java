package br.com.fundamentos.enums.enumerador;

public class App {

	/*
	 * ao inves de
	 * public static final int ESTACAO_INVERNO = 0; 
	 * public static final int ESTACAO_PRIMAVERA = 1; 
	 * public static final int ESTACAO_VERAO = 2; 
	 * public static final int ESTACAO_OUTONO = 3;
	 */

	enum Estacao {INVERNO, PRIMAVERA, VERAO, OUTONO};

	public static void main(String[] args) {
		// utilize
		Estacao e = Estacao.INVERNO;
		System.out.println(e.ordinal() + " " + e.name()); // 0 INVERNO
	}
}