package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main04 {
	
	public static void main(String[] args) {
		try {
			Double numb1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n\u00famero: "));
			Double numb2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n\u00famero: "));
			String operador = JOptionPane.showInputDialog("Digite o operador para efetuar o c\u00e1lculo.\n(+, -, x, ÷, %)");
			Double resultador = efetuarCalculo(numb1, numb2, operador);
			if (resultador == null) {
				JOptionPane.showMessageDialog(null, "Voc\u00ea digitou um dado inv\u00e1lido.");
			} else {
				JOptionPane.showMessageDialog(null, "O resultado da operação \u00e9: " + resultador);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Voc\u00ea digitou um dado inv\u00e1lido.");
		}
	}

	public static Double efetuarCalculo(Double numero1, Double numero2, String operador) {
		if (operador.equals("+")) {
			return numero1 + numero2;
		} else if (operador.equals("-")) {
			return numero1 - numero2;
		} else if (operador.equalsIgnoreCase("x")) {
			return numero1 * numero2;
		} else if (operador.equals("÷") || operador.equals("/")) {
			if (numero2 == 0) {
				return null;
			} else {
				return numero1 / numero2;
			}
		} else if (operador.equalsIgnoreCase("%")) {
			return numero1 % numero2;
		} else {
			return null;
		}
	}
}