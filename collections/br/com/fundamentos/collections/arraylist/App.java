package br.com.fundamentos.collections.arraylist;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("a");
		listaString.add("b");
		listaString.add("c");
		listaString.add("d");
		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}
	}
}