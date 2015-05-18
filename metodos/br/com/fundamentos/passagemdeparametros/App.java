package br.com.fundamentos.passagemdeparametros;

public class App {

	public static void main(String[] args) {
		int i[] = {1,2,3,4};
		int o = 10;
		
		Duplicacao duplicacao=new Duplicacao();
		duplicacao.duplicador(i);
		for (int y = 0, s = i.length; y < s; y++) {
			System.out.println("Valor de i[" + y + "] = " + i[y]);
		}
		duplicacao.incrementador(o);
		System.out.println("Valor de o = " + o);
	}
}