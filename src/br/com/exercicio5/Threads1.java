package br.com.exercicio5;

public class Threads1 implements Runnable {

	public static int contadorMensagens = 0;

	@Override
	public void run() {
		contadorMensagens++;
		String mensagem = getMensagens(contadorMensagens);
		if (mensagem != null) {
			System.out.println(mensagem);
		}
	}

	public String getMensagens(int posicao) {
		return ThreadMesagens.getMensagem(posicao);
	}
}