package br.com.string;

public class Caracteres {

	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public boolean equals(Caracteres carac) {
		if (this.texto.equals(carac.texto)) {
			return true;
		} else {
			return false;
		}
	}
}