package br.com.fundamentos.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConverteFileJsonParaObjectJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			String l;
			FileReader f = new FileReader("arquivos/file-json-para-object-json.json");
			BufferedReader b = new BufferedReader(f);
			StringBuilder sb = new StringBuilder();
			while ((l = b.readLine())!=null) {
				sb.append(l);
			}
			b.close();
			
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(sb.toString());
			JSONObject json = (JSONObject) obj;
			
			Set<String> keys = json.keySet();
			for (String key : keys) {
				System.out.println(json.get(key));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Não foi possível efetuar a leitura do arquivo !!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possível efetuar a leitura do arquivo !!!");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Não foi possível efetuar a gração do arquivo !!!");
		}
	}
}