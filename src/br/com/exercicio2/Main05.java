package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main05 {
	
	public static void main(String[] args) {
		Integer numero = null;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um a quantidade de funcion\u00e1rios: "));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Voc\u00ea digitou um dado inv\u00e1lido.");
		}
		if (numero != null) {
			Integer somaFatorial = 1;
			for (int x = 1, y = numero; x <= y; x++) {
				somaFatorial = somaFatorial * x;
			}

			JOptionPane.showMessageDialog(null, "A soma fatorial do n\u00famero " + numero + " \u00e9: " + somaFatorial);
		}
	}
}