package br.com.exercicio5;

public class Main01a {

	public static void main(String[] args) {
		System.out.println("|||Nome             |||Idade |||Sexo |||Empresa          |||");
		for (Pessoa pessoa : CollectionsPessoas.builderCollections()) {
			System.out.println(pessoa);
		}
	}
}