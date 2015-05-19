package br.com.fundamentos.threads.sincronizacao;

public class Consumidor extends Thread {

	private Buffer buffer;

	public Consumidor(Buffer buffer, int numero) {
		this.buffer = buffer;
	}

	@SuppressWarnings("unused")
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int valor = buffer.get();
				sleep((int) (Math.random() * 1000));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}