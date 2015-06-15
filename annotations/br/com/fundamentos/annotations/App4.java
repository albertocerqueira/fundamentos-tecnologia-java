package br.com.fundamentos.annotations;

import java.lang.reflect.Method;

public class App4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Class<Cliente> clazz = (Class<Cliente>) cliente.getClass();
		for (Method m : clazz.getDeclaredMethods()) {
			System.out.println(m.getName());
		}
	}
}