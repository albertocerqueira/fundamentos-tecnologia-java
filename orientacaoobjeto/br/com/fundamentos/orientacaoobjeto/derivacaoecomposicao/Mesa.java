package br.com.fundamentos.orientacaoobjeto.derivacaoecomposicao;

public class Mesa {
	Tampo tampo;
	Pernas pernas;
	
	public Mesa() {
		tampo = new Tampo();
		pernas = new Pernas();
	}
}

class Tampo {
	public String getInfo() {
		return "Tampo";
	}
}

class Pernas {
	public String getInfo() {
		return "Pernas";
	}
}