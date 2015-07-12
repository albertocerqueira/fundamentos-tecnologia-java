package br.com.fundamentos.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add("Henrique");
		nomes.add("Matias");
		nomes.add("Nascimento");
		nomes.add("Maria");
		
		System.out.println(nomes);
		System.out.println(nomes.contains("José"));
	}
}