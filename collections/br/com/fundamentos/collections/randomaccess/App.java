package br.com.fundamentos.collections.randomaccess;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("a");
		listaString.add("b");
		listaString.add("c");
		listaString.add("d");
		for (int i = 0, s = listaString.size(); i < s; i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}
	}
}