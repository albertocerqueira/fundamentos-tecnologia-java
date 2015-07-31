package br.com.fundamentos.pilhas;

public class App1 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(null, 5, null);
		pilha.push(pilha, "Junior", "sda", 5);
		pilha.push(pilha, "tio", 5, 5);
		pilha.push(pilha, "fidalgo", 5, 5);
		pilha.push(pilha, "mario", 5, 5);
		pilha.push(pilha, "zeuda", "sda", 5);
		pilha.top(pilha);
		pilha.pop(pilha);
		pilha.top(pilha);
	}
}
