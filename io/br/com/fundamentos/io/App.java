package br.com.fundamentos.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class App {

	public static void main(String[] args) {
		try{
			// System.in retorna InputStream
			InputStream is = System.in;
			// O InputStream pode ser decorado com InputStreamReader
			InputStreamReader isr = new InputStreamReader(is);
			// que por sua vez � decorado com BufferedReader
			BufferedReader stdin = new BufferedReader(isr);
			
			// gravacao
			FileWriter fw = new FileWriter("arquivos/saidaTexto.txt");
			PrintWriter out = new PrintWriter(fw);
			
			System.out.print("Digite e pressione <Enter>:");			
			String linha = stdin.readLine();
			out.print(linha);
			
			while (!linha.equals("")) {
				System.out.print("Digite e pressione <Enter>:");			
				linha = stdin.readLine();
				out.println(linha);
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}