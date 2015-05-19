package br.com.fundamentos.threads.thread;

public class ThreadExemplo extends Thread {

	public void run() {
		int i = 0;
		while (i < 30) {
			i++;
			System.out.println("Contando " + i + "...");
		}
	}
}