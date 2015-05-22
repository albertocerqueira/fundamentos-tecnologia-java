package br.com.fundamentos.orientacaoobjeto.interfaces;

public class App {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.andar();
		
		Gato gato = new Gato();
		gato.parar();
	}
}