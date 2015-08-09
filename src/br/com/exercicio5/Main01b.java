package br.com.exercicio5;

import java.util.*;

public class Main01b {

	public static void main(String[] args) {
		List<Pessoa> pessoas = (List<Pessoa>) CollectionsPessoas.builderCollections();
		Collections.sort(pessoas);
		System.out.println("|||Nome             |||Idade |||Sexo |||Empresa          |||");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
