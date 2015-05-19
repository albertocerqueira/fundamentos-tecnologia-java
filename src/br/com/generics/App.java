package br.com.generics;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno("Jos\u00e9", 1));
		lista.add(new Aluno("Maria", 8));

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}