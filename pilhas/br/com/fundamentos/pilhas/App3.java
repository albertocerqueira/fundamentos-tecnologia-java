package br.com.fundamentos.pilhas;

import java.util.*;

public class App3 {
	
	public static void main(String[] args) {
		Stack<Dog> pilhaDog = new Stack<Dog>();

		Dog d1 = new Dog(20, 10);
		Dog d2 = new Dog(15, 4);
		Dog d3 = new Dog(21, 3);

		d1.setNome("Tot\u00f3");
		d2.setNome("Viralata");
		d3.setNome("Rex");
		pilhaDog.push(d1);
		pilhaDog.push(d2);
		pilhaDog.push(d3);

		Dog liberacao = new Dog(21, 3);

		liberacao = pilhaDog.peek();
		System.out.println(d1.validaPeso() + "\n" + d1.validaAgressividade());
		System.out.println("Nome do C\u00e3o no topo da pilha: " + liberacao.getNome());

		liberacao = pilhaDog.pop();
		liberacao = pilhaDog.pop();

		System.out.println("Nome do C\u00e3o retirado da pilha: " + liberacao.getNome());
	}

	public static void proibiDogsPesados(Dog d1) {
		d1.getPeso();
	}
}