package br.com.exercicio5;

import java.io.*;
import javax.swing.JOptionPane;

public class Main02 {

	public static void main(String[] args) {
		String mensagem = JOptionPane.showInputDialog("Informe a mensagem a ser CRIPTOGRAFADA: ");
		FileWriter arqCriptografada;
		String mensagemCriptografada = criptografar(mensagem);
		try {
			arqCriptografada = new FileWriter("mensagemCodificada.txt");
			PrintWriter gravarArq = new PrintWriter(arqCriptografada);
			gravarArq.printf(mensagemCriptografada);
			arqCriptografada.close();
		} catch (IOException ex) {
			System.out.println("Erro...");
		}

		System.out.println("Mensagem Criptografada: " + mensagemCriptografada);

		FileWriter arqDescriptografada;
		String mensagemDescriptografada = descriptografar(mensagemCriptografada);
		try {
			arqDescriptografada = new FileWriter("mensagemDescodificada.txt");
			PrintWriter gravarArq = new PrintWriter(arqDescriptografada);
			gravarArq.printf(mensagemDescriptografada);
			arqDescriptografada.close();
		} catch (IOException ex) {
			System.out.println("Erro...");
		}

		System.out.println("Mensagem Descriptografada: " + mensagemDescriptografada);
	}

	public static String descriptografar(String mensagem) {
		StringBuilder textoCifrado = new StringBuilder();
		int tamanhoTexto = mensagem.length();

		for (int c = 0; c < tamanhoTexto; c++) {
			int letraDecifradaASCII = ((int) mensagem.charAt(c)) - 1;
			while (letraDecifradaASCII < 32) {
				letraDecifradaASCII += 94;
			}
			textoCifrado.append(((char) letraDecifradaASCII));
		}
		return textoCifrado.toString();
	}

	public static String criptografar(String mensagem) {
		StringBuilder textoCifrado = new StringBuilder();
		int tamanhoTexto = mensagem.length();

		for (int c = 0; c < tamanhoTexto; c++) {
			int letraCifradaASCII = ((int) mensagem.charAt(c)) + 1;
			while (letraCifradaASCII > 126) {
				letraCifradaASCII -= 94;
			}
			textoCifrado.append(((char) letraCifradaASCII));
		}
		return textoCifrado.toString();
	}
}