package br.com.fundamentos.collections.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		SortedSet<String> nomes = new TreeSet<String>();
		
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add("Henrique");
		nomes.add("Matias");
		nomes.add("Nascimento");
		nomes.add("Maria");
		
		System.out.println(nomes);
		System.out.println(nomes.contains("Jose"));
	}
}