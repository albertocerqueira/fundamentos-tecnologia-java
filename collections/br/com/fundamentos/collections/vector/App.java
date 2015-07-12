package br.com.fundamentos.collections.vector;

import java.util.Vector;

public class App {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		
		vector.add("a");
		vector.add("b");
		vector.add("c");
		vector.add("d");
		vector.add("e");
		
		for (int i = 0, s = vector.size(); i < s; i++) {
			System.out.println("vector " + i + ": " + vector.get(i));
		}
	}
}