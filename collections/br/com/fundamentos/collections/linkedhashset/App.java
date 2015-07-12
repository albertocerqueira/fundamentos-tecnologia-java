package br.com.fundamentos.collections.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> nomes = new LinkedHashSet<String>();
		
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add("Henrique");
		nomes.add("Matias");
		nomes.add("Nascimento");
		nomes.add("Maria");
		
		System.out.println(nomes);
		System.out.println(nomes.contains("Jos�"));
	}
}