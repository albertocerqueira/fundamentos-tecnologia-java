package br.com.fundamentos.annotations;

import java.lang.reflect.Field;

public class App3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Class<Cliente> clazz = (Class<Cliente>) cliente.getClass();
		for (Field f : clazz.getDeclaredFields()) {
			System.out.println(f.getName());
		}
	}
}