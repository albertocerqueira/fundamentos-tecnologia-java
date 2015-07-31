package br.com.fundamentos.pilhas;

import java.util.*;

public class App2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Stack pilha = new Stack();

		pilha.push(10);
		pilha.push(20);
		pilha.push(30);

		System.out.println("Posiç\u00e3o do valor 20: " + pilha.search(20));
		System.out.println("Elemento no topo da pilha: " + pilha.peek());
		System.out.println("Retirando elemento " + pilha.pop() + " da pilha.");
		System.out.println("Elemento atual no topo da pilha: " + pilha.peek());
	}
}
