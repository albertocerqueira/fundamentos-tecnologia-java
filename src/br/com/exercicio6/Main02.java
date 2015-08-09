package br.com.exercicio6;

import java.util.ArrayList;

public class Main02 {

	public static void main(String[] args) {
		Funcionario f01 = new Funcionario("João", 33);
		f01.addHabilidade("JAVA");
		f01.addHabilidade("Android");
		f01.addHabilidade("Cobol");
		f01.addHabilidade("C++");
		f01.addHabilidade("C");
		f01.addNomeFilho("Mario");
		f01.addNomeFilho("Maria");
		f01.addNomeFilho("Bob");

		Funcionario f02 = new Funcionario("José", 33);
		f02.addHabilidade("JAVA");
		f02.addHabilidade("Android");
		f02.addHabilidade("Cobol");
		f02.addHabilidade("C++");
		f02.addHabilidade("C");
		f02.addHabilidade("HTML");
		f02.addHabilidade("javascript");
		f02.addHabilidade("CSS");
		f02.addNomeFilho("Mario");
		f02.addNomeFilho("Maria");
		f02.addNomeFilho("Bob");
		f02.addNomeFilho("Fidalgo");
		f02.addNomeFilho("Jonas");

		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(f01);
		funcionarios.add(f02);
		for (Funcionario f : funcionarios) {
			System.out.println("----------------- Nome Funcionário -----------------");
			System.out.println("----------------- " + f.getNome() + " -----------------");
			System.out.println("----------------- Idade -----------------");
			System.out.println("----------------- " + f.getIdade() + " -----------------");
			System.out.println("----------------- Filhos -----------------");
			for (String nomeFilho : f.getNomeFilhos()) {
				System.out.println("----------------- " + nomeFilho + " -----------------");
			}
			System.out.println("----------------- Habilidades -----------------");
			for (String habilidade : f.getHabilidades()) {
				System.out.println("----------------- " + habilidade + " -----------------");
			}
			System.out.println("\n\n");
		}
	}
}