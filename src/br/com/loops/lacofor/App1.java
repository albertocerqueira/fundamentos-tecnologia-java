package br.com.loops.lacofor;

import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		listaAluno.add(new Aluno("Maria", 11));
		listaAluno.add(new Aluno("Jose", 12));
		listaAluno.add(new Aluno("Henrique", 13));

		for (int i = 0; i < listaAluno.size(); i++) {
			System.out.println("listaAluno " + i + ": " + listaAluno.get(i));
		}

		for (Aluno aluno : listaAluno) {
			System.out.println("listaAluno : " + aluno);
		}

	}

}
