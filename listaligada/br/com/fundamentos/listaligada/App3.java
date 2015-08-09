package br.com.fundamentos.listaligada;

import java.util.*;

public class App3 {
	
	public static void main(String[] args) {
		LinkedList<Elemento> lista = new LinkedList<Elemento>();
		int menu = 1;
		String objeto;
		int posicao;
		while (menu != 0) {// While para rodar o menu.
			Scanner recebe = new Scanner(System.in);
			System.out.println("Digite:");
			System.out.println("1-Inserir elemento no início da lista.");
			System.out.println("2-Inserir elemento no final da lista.");
			System.out.println("3-Inserir elemento em uma determinada posição da lista.");
			System.out.println("4-Mostrar um elemento de determinada posição da lista.");
			System.out.println("5-Mostrar a posição de um determinado elemento.");
			System.out.println("6-Mostrar e excluir o primeiro elemento da lista.");
			System.out.println("7-Mostrar e excluir o último elemento da lista.");
			System.out.println("8-Mostrar e excluir o elemento de determinada posição da lista.");
			System.out.println("9-Mostrar e excluir determinado elemento da lista.");
			System.out.println("10-Substituir por outro o elemento de determinada posição da lista.");
			System.out.println("11-Mostrar todos os elementos da lista.");
			System.out.println("12-Remover todos os elementos da lista.");
			System.out.println("0-Sair.");
			menu = recebe.nextInt();
			int tamanho = lista.size();
			// Condições abaixo.
			if (menu == 1) {
				System.out.println("Digite o elemento para adicionar no inicio da lista: ");
				objeto = recebe.next();
				Elemento elemento = new Elemento(objeto);
				lista.addFirst(elemento);
			} else if (menu == 2) {
				System.out.println("Digite o elemento para adicionar no final da lista: ");
				objeto = recebe.next();
				Elemento elemento = new Elemento(objeto);
				lista.addLast(elemento);
			} else if (menu == 3) {
				System.out.println("Digite o elemento para adicionar: ");
				objeto = recebe.next();
				System.out.println("Digite a posição na lista: ");
				posicao = recebe.nextInt();
				lista.add(posicao, new Elemento(objeto));
			} else if (menu == 4) {
				System.out.println("Digite a posição do elemento para mostrar: ");
				posicao = recebe.nextInt();
				lista.get(posicao);
			} else if (menu == 5) {
				System.out.println("Digite o elemento para mostrar sua posição: ");
				objeto = recebe.next();
				lista.indexOf(objeto);
			} else if (menu == 6) {
				System.out.println("Primeiro elemento da lista foi deletado");
				lista.getFirst();
				lista.pollFirst();
			} else if (menu == 7) {
				System.out.println("Ultimo elemento da lista foi deletado");
				lista.getLast();
				lista.pollLast();
			} else if (menu == 8) {
				System.out.println("Digite o elemento para deletar da lista");
				posicao = recebe.nextInt();
				lista.get(posicao);
				lista.remove(posicao);
			} else if (menu == 9) {
				System.out.println("Digite o elemento para deletar: ");
				objeto = recebe.next();
				lista.get(lista.indexOf(objeto));
			} else if (menu == 10) {
				System.out.println("Digite o elemento para adicionar");
				objeto = recebe.next();
				System.out.println("Digite a posição para coloca-lo: ");
				posicao = recebe.nextInt();
				lista.add(posicao, new Elemento(objeto));
			} else if (menu == 11) {
				System.out.println("Todos Elementos da lista foram deletados");
				for (int x = 0; x < tamanho; x++) {
					lista.get(x);
				}
			} else if (menu == 12) {
				lista.clear();
				System.out.println("Todos elementos da lista foram deletados.");
			}
		}
	}
}