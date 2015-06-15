package br.com.fundamentos.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App5 {

	@SuppressWarnings("rawtypes")
	private static Object createNewInstance(Class clazz) {
		Constructor<?> ctor;
		try {
			ctor = clazz.getConstructors()[0];
			Object object = ctor.newInstance();
			return object;
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Cliente cliente = (Cliente) createNewInstance(Cliente.class);
		if (cliente == null) {
			System.err.println("Ops, n\u00e3o foi possível criar o objeto cliente");
		} else {
			System.out.println("Objeto cliente criado = " + cliente.toString());
		}
	}
}