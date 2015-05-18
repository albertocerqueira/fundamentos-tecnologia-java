package br.com.fundamentos.orientacaoobjeto.construtor;

public class Bicicleta {
	
	public Bicicleta() {}
	
	public Bicicleta(String cor) {
		this();
	}
	
	public Bicicleta(String cor, int velocidade, int marcha, float valor) {
		this(cor);
	}
}