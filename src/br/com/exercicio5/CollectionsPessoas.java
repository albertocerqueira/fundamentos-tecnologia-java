package br.com.exercicio5;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsPessoas {

	public static Collection<Pessoa> builderCollections() {
		Collection<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Alberto Cerqueira", 23, "M", "Wave Solutions"));
		pessoas.add(new Pessoa("Larry Page", 40, "M", "Google"));
		pessoas.add(new Pessoa("Sergey Brin", 40, "M", "Google"));
		pessoas.add(new Pessoa("Mark Zuckerberg", 29, "M", "Facebook"));
		pessoas.add(new Pessoa("Bill Gates", 57, "M", "Microsolf"));

		return pessoas;
	}
}