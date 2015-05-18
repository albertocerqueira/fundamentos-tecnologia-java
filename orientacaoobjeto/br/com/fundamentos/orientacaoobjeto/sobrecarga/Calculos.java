package br.com.fundamentos.orientacaoobjeto.sobrecarga;

public class Calculos {

	public int calcular(int i) {
		return -i;
	}
	
	public int calcular(int i, int j) {
		return i+j;
	}
	
	public int calcular(int i, int j, String operacao) {
		if (operacao.equals("soma")) {
			return i+j;
		} else if (operacao.equals("subtracao")) {
			return i-j;
		} else {
			return 0;
		}
	}
}