package br.com.fundamentos.collections.linkedlist;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		
		for (int i = 0, s = ll.size(); i < s; i++) {
			System.out.println("listaString " + i + ": " + ll.get(i));
		}
	}
}