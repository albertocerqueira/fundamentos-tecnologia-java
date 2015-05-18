package br.com.fundamentos.io.file;

import java.io.File;
import java.io.FileOutputStream;

public class App {

	public static void main(String[] args) {
		File diretorio = new File("arquivos/");
		// cria, se possivel
		diretorio.mkdir(); 

		File arquivo = new File(diretorio, "xpto.txt");
		FileOutputStream out;
		try {
			out = new FileOutputStream(arquivo);
			// se arquivo nao existe, tenta criar
			out.write(new byte[] {'h','e','l', 'l','o'});
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] arquivos = diretorio.list();
		for (int i = 0; i < arquivos.length; i++) {
			File filho = new File(diretorio, arquivos[i]);
			System.out.println("Caminho "+filho.getAbsolutePath());
			System.out.println("\u00e9 diret\u00f3rio? " + filho.isDirectory());
			System.out.println("\u00e9 arquivo? " + filho.isFile());
			System.out.println("\u00e9 oculto? " + filho.isHidden());
		}

		if (arquivo.exists()) {
			arquivo.delete();
		}
	}
}