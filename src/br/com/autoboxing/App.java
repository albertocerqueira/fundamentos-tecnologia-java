package br.com.autoboxing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		ArrayList<Short> a = new ArrayList<Short>();
		a.add((short) 1);
		Map<Short, Aluno> lista = new HashMap<Short, Aluno>();
		lista.put((short) 1, new Aluno("Jo\u00e3o", 10));
		Aluno aluno = lista.get((short) 1);
		System.out.println(aluno);
	}
}