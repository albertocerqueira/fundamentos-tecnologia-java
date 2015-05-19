package br.com.fundamentos.threads.runnable;

public class App {

	public static void main(String[] args) {
		RunnableExemplo runnableExemplo = new RunnableExemplo();
		Thread thread = new Thread(runnableExemplo);
		thread.start();
	}
}