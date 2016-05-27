package br.com.fundamentos.json;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ConverteObjectJsonParaFileJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		try {
			JSONObject json = new JSONObject();
			json.put("nome", "Alberto Cerqueira");
			json.put("data-de-nascimento", "23/06/1990");
			
			JSONArray jsonArray = new JSONArray();
			jsonArray.add("competência: java");
			jsonArray.add("competência: javascript");
			jsonArray.add("competência: scala");
			jsonArray.add("competência: php");
			json.put("competências", jsonArray);
			
			FileWriter file = new FileWriter("arquivos/object-json-para-file-json.json");
			file.write(json.toJSONString());
			System.out.println("Sucesso na copia do JSON Object para File...");
			System.out.println("\nJSON Object: " + json);
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Não foi possível efetuar a leitura do arquivo !!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possível efetuar a leitura do arquivo !!!");
		}
	}
}