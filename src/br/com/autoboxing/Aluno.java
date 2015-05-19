package br.com.autoboxing;

public class Aluno {

	String nome;
	int nota;

	public Aluno(String nome, int nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	public String toString() {
		return nome;
	}
}