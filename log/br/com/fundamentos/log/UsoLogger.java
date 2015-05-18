package br.com.fundamentos.log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsoLogger {
	
	Logger logger1 = Logger.getLogger(UsoLogger.class.getName());
	
	public static void main(String[] args) {
		new UsoLogger().readTxtFile(new File("arquivos/arquivo.log"));
	}
	
	public void readTxtFile(File file) {
		try {
			logger1.setLevel(Level.ALL);
			// leitor
			BufferedReader br;
			
			logger1.log(Level.INFO, "Abrindo arquivo...");
			br = new BufferedReader(new FileReader(file));
			
			// lê linha a linha
			String linha = br.readLine();
			while (linha != null) {
				logger1.log(Level.INFO, "Lendo linha (linha)...");
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			logger1.log(Level.SEVERE, e.getMessage(), e); 

		} catch (IOException e) {
			logger1.log(Level.SEVERE, e.getMessage(), e); 
		}
	}
}