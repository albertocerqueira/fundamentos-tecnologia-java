package br.com.fundamentos.listaligada;

import java.util.Scanner;

public class App1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner recebe = new Scanner(System.in);
		ListaDePessoa Listapessoa = new ListaDePessoa();

		Pessoa pessoa = new Pessoa();
		String sair = "Vai Brasil";
		String imprimir = "";

		while (!sair.equals("s")) {
			System.out.println("Digite o peso da pessoa: ");
			pessoa.setPeso(recebe.nextInt());
			System.out.println("Digite o idade da pessoa: ");
			pessoa.setIdade(recebe.nextInt());
			System.out.println("Digite o nome da pessoa: ");
			pessoa.setNome(recebe.next());

			if (Listapessoa.listaFora.size() != 0 || Listapessoa.listaDentro.size() != 0) {
				Listapessoa.mandaPessoaParaLista(pessoa);
			}

			System.out.println("Dese1a imprimir as lista? (s/n)");
			imprimir = recebe.next();
			if (imprimir.equals(imprimir)) {
				Listapessoa.imprimeListas();
			}
			System.out.println("Deseja sai do sistema? (s/n)");
			sair = recebe.next();
		}
	}
}