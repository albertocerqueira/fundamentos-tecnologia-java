package br.com.fundamentos.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App {

	public static void main(String[] args) {
		try{
			// cria File de entrada e saida
			File fonte = new File("arquivos/fonte.txt");
			File destino = new File("arquivos/destino.txt");

			// cria os Streams
			FileInputStream in = new FileInputStream(fonte);
			FileOutputStream out = new FileOutputStream(destino);

			// le 8192 bytes
			byte[] buffer = new byte[8192];
			int length = in.read(buffer);
				
			while (length != -1) {
				out.write(buffer, 0, length);
				buffer = new byte[8192];
				length = in.read(buffer);
			}

			in.close();
			out.flush();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}