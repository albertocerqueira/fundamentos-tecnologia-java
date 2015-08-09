package br.com.exercicio3;

import javax.swing.JOptionPane;

public class Main04 {
	
	public static void main(String[] args) {
		try {
			Float op1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n\u00famero: "));
			Float op2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n\u00famero: "));

			CalculadoraBasicaImplements cal = new CalculadoraBasicaImplements();
			System.out.println(cal.somar(op1, op2));
			System.out.println(cal.subtrair(op1, op2));
			System.out.println(cal.multiplicar(op1, op2));
			System.out.println(cal.dividir(op1, op2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "\u00ea digitou um dado inv\u00e1lido.");
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