package br.com.fundamentos.threads.runnable;

public class RunnableExemplo implements Runnable {

	public void run() {
		int i = 0;
		while (i < 80){
			i++;
			System.out.println("Contando " + i + "...");	
		}
	}
}