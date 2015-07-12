package br.com.fundamentos.collections.collections;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {
		SortedMap<String, SortedSet<String>> agenda = new TreeMap<String, SortedSet<String>>();
		
		SortedSet<String> entrada = new TreeSet<String>();
		
		entrada.add("Ailton");
		entrada.add("Ana");
		entrada.add("Amalia");
		agenda.put("A",entrada);
		
		entrada = new TreeSet<String>();
		entrada.add("Beatriz");
		entrada.add("Bianca");
		entrada.add("Bruno");
		agenda.put("B",entrada);
		
		entrada = new TreeSet<String>();
		entrada.add("Carlos");
		entrada.add("Cristina");
		agenda.put("C",entrada);
		
		System.out.println(agenda);
	}
}