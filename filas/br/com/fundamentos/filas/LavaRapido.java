package br.com.fundamentos.filas;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Scanner;


public class LavaRapido {
	
	Scanner recebe = new Scanner(System.in);
	Carro carro = new Carro();
	int quantidade;
	String modelo;

	/*
	 * public void capacidadeLavaRapido() {
	 * System.out.println("Digite a capacidade do Lava-Rapido:"); quantidade =
	 * recebe.nextInt(); }
	 */

	ArrayBlockingQueue<Carro> fila = new ArrayBlockingQueue<Carro>(10);

	// Adiciona um carro.
	public void adicionarCarro(Carro carro) {
		fila.add(carro);
		System.out.println("O carro " + carro.getModelo() + " foi adicionado a fila.");
	}

	// Chama o carro que esta sendo lavado.
	public void atenderCarro() {
		System.out.println("O carro " + fila.poll() + " esta sendo atendido.");
	}

	// Retorna o tamanho da fila.
	public int tamanhoFila() {
		int tamanho;
		tamanho = fila.size();
		return tamanho;
	}
}