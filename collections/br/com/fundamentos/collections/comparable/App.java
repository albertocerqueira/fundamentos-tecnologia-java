package br.com.fundamentos.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		ArrayList<Cliente> listaCliente=new ArrayList<Cliente>();
		
		Cliente cliente3 = new Cliente(774, "Matias");
		Cliente cliente1 = new Cliente(4, "Joao");
		Cliente cliente2 = new Cliente(3, "Maria");
		Cliente cliente4 = new Cliente(28, "Marcelo");
		
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);
		
		Iterator<Cliente> iterador = listaCliente.iterator();
		while (iterador.hasNext()) {
			Cliente cliente=iterador.next();
			System.out.println("ID " + cliente.getIdentificacao() + " " + cliente);
		}
		
		Collections.sort(listaCliente);
		iterador = listaCliente.iterator();
		while (iterador.hasNext()) {
			Cliente cliente=iterador.next();
			System.out.println("ID " + cliente.getIdentificacao() + " " + cliente);
		}
	}
}