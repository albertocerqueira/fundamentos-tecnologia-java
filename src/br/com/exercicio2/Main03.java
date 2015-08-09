package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main03 {
	public static void main(String[] args) {
		Integer quantidadeFuncionarios = 0;
		try {
			quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcion\u00e1rios: "));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Voc\u00ea digitou um dado inv\u00e1lido.");
		}
		if (quantidadeFuncionarios > 0) {
			Integer somaSalarios = 0;
			for (int x = 0, y = quantidadeFuncionarios; x < y; x++) {
				String salario = JOptionPane.showInputDialog("Digite o sal\u00e1rio do funcion\u00e1rio " + (x + 1) + ": ");
				somaSalarios = somaSalarios + Integer.parseInt(salario);
			}
			JOptionPane.showMessageDialog(null, "A media sal\u00e1rial da empresa \u00e9: " + somaSalarios / quantidadeFuncionarios);
		} else {
			JOptionPane.showMessageDialog(null, "Voc\u00ea digitou um dado inv\u00e1lido.");
		}
	}
}