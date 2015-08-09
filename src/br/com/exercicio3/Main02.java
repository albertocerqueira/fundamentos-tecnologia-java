package br.com.exercicio3;

public class Main02 {

	public static void main(String[] args) {
		Equipamento eq = new Equipamento();
		Equipamento eq2 = new Equipamento();
		Equipamento eq3 = new Equipamento();
		Equipamento eq4 = new Equipamento();
		Movel mo = new Movel();
		Tablet tab = new Tablet();
		Tablet tab2 = new Tablet();
		Smartphone sma = new Smartphone();
		Smartphone sma2 = new Smartphone();

		Object obj1 = eq; // Conversão válida
		Object obj2 = mo; // Conversão válida
		eq = tab; //
		eq2 = sma; //
		// sma = tab; //Erro de Compilação
		// sma2 = tab2; //Erro de Compilação
		eq3 = tab; //
		mo = tab; //
		// tab = eq4; //Erro de Compilação
	}
}