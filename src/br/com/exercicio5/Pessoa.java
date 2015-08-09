package br.com.exercicio5;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private Integer idade;
	private String sexo;
	private String empresa;

	public Pessoa(String nome, Integer idade, String sexo, String empresa) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
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
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		String _nome = stringBuilder(getNome()) + "|||";
		String _idade = getIdade() + "    |||";
		String _sexo = getSexo() + "    |||";
		String _empresa = stringBuilder(getEmpresa()) + "|||";
		return "|||" + _nome + _idade + _sexo + _empresa;
	}

	public String stringBuilder(String value) {
		int tam = 17 - value.length();
		StringBuilder builder = new StringBuilder(value);
		for (int x = 0; x < tam; x++) {
			builder.append(" ");
		}
		return builder.toString();
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.getNome());
	}

	public int compare(Pessoa pessoa1, Pessoa pessoa2) {
		return (-1) * pessoa1.getNome().compareTo(pessoa2.getNome());
	}
}