package br.com.fundamentos.listaligada;

import java.util.LinkedList;

public class ListaDePessoa {
	
    LinkedList<Pessoa> listaDentro = new LinkedList<Pessoa>();
    LinkedList<Pessoa> listaFora = new LinkedList<Pessoa>();

    Pessoa pessoa = new Pessoa();
    boolean foraLista = false;

    public void mandaPessoaParaLista(Pessoa pessoa) {
        mandaPessoaParaFora(pessoa);
        if (pessoa.getPeso() >= listaDentro.getLast().getPeso()) {
            listaDentro.addLast(pessoa);
        } else {
            listaDentro.addFirst(pessoa);
        }
    }

    public void mandaPessoaParaFora(Pessoa pessoa) {
        if (pessoa.getPeso() <= listaDentro.getLast().getPeso()) {
            listaFora.add(pessoa);
        }
    }
    
    public void imprimeListas() {
        for (int x=0 ; x<listaFora.size() ; x++) {
            System.out.println("Lista Dentro" + listaDentro.get(x));
            System.out.println("Lista Fora" + listaFora.get(x));
        }
    }
}