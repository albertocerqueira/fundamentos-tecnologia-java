package br.com.string.stringbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String linha = "";
		
		while (!linha.equals("q")) {
			BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
			try {
				linha = inReader.readLine();
			} catch (IOException e) {
				System.out.println("Erro na Leitura");
			}
			sb.append(linha);
		}
		System.out.println(sb.toString());
	}
}