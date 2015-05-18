package br.com.fundamentos.io.leituradearquivoscomdecorator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		try{
			// System.in retorna InputStream
			InputStream is = System.in;

			// O InputStream pode ser decorado com InputStreamReader
			InputStreamReader isr = new InputStreamReader(is);

			// que por sua vez e decorado com BufferedReader
			BufferedReader stdin = new BufferedReader(isr);
			
			// pede ao usu�rio que digite a entrada
			System.out.print("Digite e pressione <Enter>:");			
			String linha = stdin.readLine();
					
			// Sa�da
			System.out.println(linha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}