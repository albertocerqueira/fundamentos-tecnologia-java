package br.com.fundamentos.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class App6 {

	@SuppressWarnings("rawtypes")
	public static void mostrarValores(Object obj) {
		try {
			Class clazz = obj.getClass();
			for (Method m : clazz.getDeclaredMethods()) {
				if (m.isAnnotationPresent(Mostrar.class)) {
					if (m.getParameterTypes().length > 0) {
						System.err.println(m.getName() + " anotado com @Mostrar de forma errada, ignorando ...");
						continue;
					}
					System.out.println(m.getName() + ": " + m.invoke(obj));
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(1010);
		cliente.setDataNascimento(new Date());
		cliente.setEnderecoCompleto("Rua ABC, Bairro YHU nº 190");
		cliente.setNome("Antonio da Silva Nunes");
		cliente.setNomeMae("Maria da Silva Nunes");
		cliente.setNomePai("Joao da Silva Nunes");
		mostrarValores(cliente);
	}
}