package br.com.fundamentos.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> nomes = new LinkedHashMap<Integer, String>();
		
		nomes.put(1,"Maria");
		nomes.put(2,"Jose");
		nomes.put(3,"Henrique");
		nomes.put(4,"Matias");
		nomes.put(5,"Nascimento");
		nomes.put(6,"Maria");
		
		System.out.println(nomes);
		System.out.println(nomes.get(2));
	}
}