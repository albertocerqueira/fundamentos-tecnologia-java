package br.com.fundamentos.threads.sincronizacao;

public class App {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
        Produtor produtor = new Produtor(buffer, 0);
        Consumidor consumidor = new Consumidor(buffer, 0);

        produtor.start();
        consumidor.start();
	}
}