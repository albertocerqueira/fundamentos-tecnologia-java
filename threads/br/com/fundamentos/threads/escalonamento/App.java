package br.com.fundamentos.threads.escalonamento;

public class App {

	public static void main(String[] args) {
		Escritor e1 = new Escritor("E1", 4);
	    Escritor e2 = new Escritor("E2", 6);
	    Escritor e3 = new Escritor("E3", 5);
	    
	    e1.start();
	    e2.start();
	    e3.start();   
	}
}