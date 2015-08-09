package br.com.exercicio6;

public class Main01 {

	public static void main(String[] args) {
		Aeroporto aeroporto1 = new Aeroporto("Internacional de Guarulhos");
		Aeroporto aeroporto2 = new Aeroporto("Aeroporto de Cumbica");

		Aviao aviao1 = new Aviao("TAM 123", aeroporto1);
		Aviao aviao2 = new Aviao("OLE 111", aeroporto1);
		Aviao aviao3 = new Aviao("LINHA 222", aeroporto1);

		aeroporto1.start();
		aviao1.start();
		aviao2.start();
		aviao3.start();
	}
}