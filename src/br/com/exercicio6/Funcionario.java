package br.com.exercicio6;

import java.util.ArrayList;
import java.util.Collection;

public class Funcionario {

	private String nome;
	private Integer idade;
	private Collection<String> habilidades = new ArrayList<String>();
	private Collection<String> nomeFilhos = new ArrayList<String>();

	public Funcionario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/**
	 * @return the habilidades
	 */
	public Collection<String> getHabilidades() {
		return habilidades;
	}

	/**
	 * @param habilidades
	 *            the habilidades to set
	 */
	public void setHabilidades(Collection<String> habilidades) {
		this.habilidades = habilidades;
	}

	/**
	 * @return the nomeFilhos
	 */
	public Collection<String> getNomeFilhos() {
		return nomeFilhos;
	}

	/**
	 * @param nomeFilhos
	 *            the nomeFilhos to set
	 */
	public void setNomeFilhos(Collection<String> nomeFilhos) {
		this.nomeFilhos = nomeFilhos;
	}

	public void addHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}

	public void addNomeFilho(String nomeFilho) {
		this.nomeFilhos.add(nomeFilho);
	}
}