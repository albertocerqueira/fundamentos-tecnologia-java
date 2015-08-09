package br.com.exercicio6;

public enum Cores {

	branco(21, "Branco"), 
	preto(22, "Preto"), 
	vermelho(23, "Vermelho"), 
	amarelo(24, "Amarelo"), 
	azul(25, "Azul");

	private String nome;
	private int codigo;

	Cores(int codigo, String nome) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public static Enum get(int codigo) {
		if (codigo == 21) {
			return Cores.branco;
		} else if (codigo == 22) {
			return Cores.preto;
		} else if (codigo == 23) {
			return Cores.vermelho;
		} else if (codigo == 24) {
			return Cores.amarelo;
		} else if (codigo == 25) {
			return Cores.azul;
		} else {
			return null;
		}
	}

	public static Enum get(String nome) {
		if (nome.equalsIgnoreCase("Branco")) {
			return Cores.branco;
		} else if (nome.equalsIgnoreCase("Preto")) {
			return Cores.preto;
		} else if (nome.equalsIgnoreCase("Vermelho")) {
			return Cores.vermelho;
		} else if (nome.equalsIgnoreCase("Amarelo")) {
			return Cores.amarelo;
		} else if (nome.equalsIgnoreCase("Azul")) {
			return Cores.azul;
		} else {
			return null;
		}
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
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}