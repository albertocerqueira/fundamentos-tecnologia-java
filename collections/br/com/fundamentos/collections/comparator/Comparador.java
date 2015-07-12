package br.com.fundamentos.collections.comparator;

import java.util.Comparator;

public class Comparador implements Comparator<Cliente> {

	public int compare(Cliente cliente, Cliente outroCliente) {
        return cliente.getNome().compareTo(outroCliente.getNome());
    }
}