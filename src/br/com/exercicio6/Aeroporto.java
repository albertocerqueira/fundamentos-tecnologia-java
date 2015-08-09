package br.com.exercicio6;

public class Aeroporto extends Thread {

	private String nome;
	private static Boolean statusPista = false;

	public Aeroporto(String nome) {
		this.nome = nome;
	}

	public static void aguardarPistaDisponivel(String nomeAviao) {
		while (!statusPista) {
			System.out.println("Aguardando limpeza da pista. Para Utilização do Avião: " + nomeAviao);
		}
	}

	public static void alterarEstadoPista() {
		if (!statusPista) {
			statusPista = Boolean.TRUE;
		} else {
			statusPista = Boolean.FALSE;
		}
	}

	@Override
	public void run() {
		while (true) {
			alterarEstadoPista();
			System.out.println("Aeroporto limpando pista...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ex) {
				System.out.println("Erro na limpeza da pista.");
			}
		}
	}

	/**
	 * @return the statusPista
	 */
	public Boolean getStatusPista() {
		return statusPista;
	}

	/**
	 * @param statusPista
	 *            the statusPista to set
	 */
	public void setStatusPista(Boolean statusPista) {
		this.statusPista = statusPista;
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
}