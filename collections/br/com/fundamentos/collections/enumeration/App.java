package br.com.fundamentos.collections.enumeration;

import java.util.Enumeration;
import java.util.Hashtable;

public class App {

	public static void main(String[] args) {
		Hashtable<Integer, String> nomes = new Hashtable<Integer, String>();
		
		nomes.put(1, "Maria");
		nomes.put(2, "Jose");
		nomes.put(3, "Henrique");
		nomes.put(4, "Matias");
		nomes.put(5, "Nascimento");
		nomes.put(6, "Maria");
		nomes.put(1, "Maria");
		
		System.out.println(nomes);
		System.out.println(nomes.get(2));
		
		Enumeration<String> enumeracao = nomes.elements();
		while (enumeracao.hasMoreElements()) {
			System.out.println(enumeracao.nextElement());
		}
	}
}