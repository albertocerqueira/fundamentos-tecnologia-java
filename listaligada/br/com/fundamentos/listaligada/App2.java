package br.com.fundamentos.listaligada;

import java.util.*;

public class App2 {
	
	public static void main(String[] args) {
        LinkedList<Pessoa> lista = new LinkedList<Pessoa>();
        Pessoa pessoa1 = new Pessoa("João",23);
        Pessoa pessoa2 = new Pessoa("Carla",25);
        lista.addFirst(pessoa2);
        lista.addFirst(pessoa1);
        lista.addFirst(new Pessoa("Manuel",21));
        lista.addFirst(new Pessoa("Monica",11));
        lista.addFirst(new Pessoa("Chico",41));
        if(lista.contains(pessoa2)){
            System.out.println("Sim... a Pessoa existe na lista !");
        }

        Pessoa p1 = lista.getFirst();
		//p1 sai da lista como objeto (depois que esta fora da lista podemos tirar, extrair tudo dele).
        p1 = lista.getLast();
        p1 = lista.get(2);
        System.out.println(lista);
        p1 = lista.pollFirst();
        p1 = lista.pollLast();
        p1 = lista.remove(1);
        lista.add(1, new Pessoa("David",11));
        lista.add(1, new Pessoa("Manuela",15));
    }
}