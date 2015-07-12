package br.com.fundamentos.collections.comparator;

public class Cliente implements Comparable<Cliente> {

	private int identificacao;
	private String nome;
	
	public Cliente(int identificacao, String nome) {
		super();
		this.identificacao = identificacao;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public String toString(){
		return nome;
	}
	
	public int compareTo(Cliente outroCliente) {
        if (this.identificacao < outroCliente.identificacao) {
            return -1;
        }
        if (this.identificacao > outroCliente.identificacao) {
            return 1;
        }
        return 0;
    }
}