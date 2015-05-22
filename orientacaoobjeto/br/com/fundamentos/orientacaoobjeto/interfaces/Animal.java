package br.com.fundamentos.orientacaoobjeto.interfaces;

public class Animal implements Mercadoria {
	
	private String nome;
	private String tipo;
	
	@Override
	public void andar() {
		System.out.println("Animal andando...");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void parar() {
		System.out.println("Animal parando...");
	}
}