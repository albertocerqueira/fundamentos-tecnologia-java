package br.com.exercicio5;

import java.util.Collections;
import java.util.List;

public class Main01c {

	public static void main(String[] args) {
		List<Pessoa> pessoas = (List<Pessoa>) CollectionsPessoas.builderCollections();
		Collections.sort(pessoas, Collections.reverseOrder());
		System.out.println("|||Nome             |||Idade |||Sexo |||Empresa          |||");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
