package br.com.fundamentos.pilhas;

public class Pilha {

	private Object nome;
	private Object peso;
	private Object agressividade;
	private Pilha proximo;

	public Pilha(Object nome, Object peso, Object agressividade) {
		this.nome = nome;
		this.peso = peso;
		this.agressividade = agressividade;
	}

	public Object getNome() {
		return nome;
	}

	public void setNome(Object nome) {
		this.nome = nome;
	}

	public Object getPeso() {
		return peso;
	}

	public void setPeso(Object peso) {
		this.peso = peso;
	}

	public Object getAgressividade() {
		return agressividade;
	}

	public void setAgressividade(Object agressividade) {
		this.agressividade = agressividade;
	}

	public Pilha getProximo() {
		return this.proximo;
	}

	public void setProximo(Pilha proximo) {
		this.proximo = proximo;
	}

	// Insercao
	public void push(Pilha pilha, Object nome, Object peso, Object agressividade) {
		Pilha temporario = new Pilha(null, null, null);
		temporario.setNome(nome);
		temporario.setPeso(peso);
		temporario.setAgressividade(agressividade);
		temporario.setProximo(pilha.getProximo());
		pilha.setProximo(temporario);
	}
	// Fim inserç\u00e3o

	// Remoç\u00e3o
	public void pop(Pilha pilha) {
		Pilha temporario = new Pilha(null, null, null);
		if (pilha.vazia(pilha) == true) {
			temporario = pilha.getProximo();
			pilha.setProximo(temporario.getProximo());
			temporario = null;
		} else {
			System.out.println("A pilha esta vazia");
		}
	}
	// Fim remoç\u00e3o

	// Imprime - Neste caso, verfica-se somente o topo
	public void top(Pilha pilha) {
		Pilha temporario = new Pilha(null, null, null);
		temporario = pilha.getProximo();
		if (temporario.vazia(temporario) == true) {
			System.out.println("Topo : " + temporario.getNome() + " tem " + getPeso() + " Kg e sua agressividade \u00e9 de intensidade " + getAgressividade() + ".");
		} else {
			System.out.println("Pilha Vazia");
		}
	}
	// Fim Top

	// Vazia
	public boolean vazia(Pilha pilha) {
		if (pilha == null) {
			return false;
		} else {
			return true;
		}
	}
}