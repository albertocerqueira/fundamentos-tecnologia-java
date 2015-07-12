package br.com.fundamentos.collections.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

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
		
		ListIterator<String> iterador = listaString.listIterator();
		
		try {
			while (iterador.hasPrevious()) {
				String valor=iterador.previous();	
				System.out.println("Valor " + valor);
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}