package br.com.exercicio4;

import java.util.*;

public class Main03 {

	public static void main(String args[]) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		WeakHashMap<Integer, Integer> weakHashMap = new WeakHashMap<Integer, Integer>();

		System.out.println("####################################################################################");
		System.out.println("Collections    ||| Tempo para adicionar 50000 itens |||  Tempo para Efetuar a buscar");
		compareArrayListWithLinkedList(arrayList, linkedList);
		System.out.println("####################################################################################");
		compareStackWithHashSet(stack, hashSet);
		System.out.println("####################################################################################");
		compareHashMapWithWeakHashMap(hashMap, weakHashMap);
		System.out.println("####################################################################################");
	}

	public static void compareHashMapWithWeakHashMap(HashMap<Integer, Integer> hashMap, WeakHashMap<Integer, Integer> weakHashMap) {
		long hashMapTA0 = System.currentTimeMillis();
		for (int x = 0; x < 50000; x++) {
			hashMap.put(x, x);
		}
		long hashMapTA1 = System.currentTimeMillis();
		long hashMapTA = hashMapTA1 - hashMapTA0;

		long hashMapT0 = System.currentTimeMillis();
		for (int x = 0; x < 15000; x++) {
			Random gerador = new Random();
			int valorBusca = gerador.nextInt(15001);
			hashMap.get(valorBusca);
		}
		long hashMapT1 = System.currentTimeMillis();
		long hashMapT = hashMapT1 - hashMapT0;
		System.out.println("####################################################################################");
		System.out.println("'HashMap'      |||" + criarTD(hashMapTA) + "|||" + criarTD(hashMapT));

		long weakHashMapTA0 = System.currentTimeMillis();
		for (int x = 0; x < 50000; x++) {
			hashMap.put(x, x);
		}
		long weakHashMapTA1 = System.currentTimeMillis();
		long weakHashMapTA = weakHashMapTA1 - weakHashMapTA0;

		long weakHashMapT0 = System.currentTimeMillis();
		for (int x = 0; x < 15000; x++) {
			Random gerador = new Random();
			int valorBusca = gerador.nextInt(15001);
			weakHashMap.get(valorBusca);
		}
		long weakHashMapT1 = System.currentTimeMillis();
		long weakHashMapT = weakHashMapT1 - weakHashMapT0;
		System.out.println("####################################################################################");
		System.out.println("'WeakHashMap'  |||" + criarTD(weakHashMapTA) + "|||" + criarTD(weakHashMapT));

		System.out.println("####################################################################################");
		if (weakHashMapT < hashMapT) {
			System.out.println("'WeakHashMap' é mais rapido para efetuar buscas em relação a 'HashMap'.");
		} else {
			System.out.println("'HashMap' é mais rapido para efetuar buscas em relação a 'WeakHashMap'.");
		}
	}

	public static void compareStackWithHashSet(Stack<Integer> stack, HashSet<Integer> hashSet) {
		long stackTA0 = System.currentTimeMillis();
		for (int x = 0; x < 50000; x++) {
			stack.add(x);
		}
		long stackTA1 = System.currentTimeMillis();
		long stackTA = stackTA1 - stackTA0;

		long stackT0 = System.currentTimeMillis();
		for (int x = 0; x < 15000; x++) {
			Random gerador = new Random();
			int valorBusca = gerador.nextInt(15001);
			stack.get(valorBusca);
		}
		long stackT1 = System.currentTimeMillis();
		long stackT = stackT1 - stackT0;
		System.out.println("####################################################################################");
		System.out.println("'Stack'        |||" + criarTD(stackTA) + "|||" + criarTD(stackT));

		long hashSetTA0 = System.currentTimeMillis();
		for (int x = 0; x < 50000; x++) {
			hashSet.add(x);
		}
		long hashSetTA1 = System.currentTimeMillis();
		long hashSetTA = hashSetTA1 - hashSetTA0;

		long hashSetT0 = System.currentTimeMillis();
		for (int x = 0; x < 15000; x++) {
			Random gerador = new Random();
			int valorBusca = gerador.nextInt(15001);
			for (Integer numero : hashSet) {
				if (numero.equals(valorBusca)) {
					break;
				}
			}
		}
		long hashSetT1 = System.currentTimeMillis();
		long hashSetT = hashSetT1 - hashSetT0;
		System.out.println("####################################################################################");
		System.out.println("'HashSet'      |||" + criarTD(hashSetTA) + "|||" + criarTD(hashSetT));

		System.out.println("####################################################################################");
		if (hashSetT < stackT) {
			System.out.println("'HashSet' é mais rapido para efetuar buscas em relação a 'Stack'.");
		} else {
			System.out.println("'Stack' é mais rapido para efetuar buscas em relação a 'HashSet'.");
		}
	}

	public static void compareArrayListWithLinkedList(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
		long arrayListTA0 = System.currentTimeMillis();
		for (int x = 0; x < 50000; x++) {
			arrayList.add(x);
		}
		long arrayListTA1 = System.currentTimeMillis();
		long arrayListTA = arrayListTA1 - arrayListTA0;

		long arrayListT0 = System.currentTimeMillis();
		for (int x = 0; x < 15000; x++) {
			Random gerador = new Random();
			int valorBusca = gerador.nextInt(15001);
			arrayList.get(valorBusca);
		}
		long arrayListT1 = System.currentTimeMillis();
		long arrayListT = arrayListT1 - arrayListT0;
		System.out.println("####################################################################################");
		System.out.println("'ArrayList'    |||" + criarTD(arrayListTA) + "|||" + criarTD(arrayListT));

		long linkedListTA0 = System.currentTimeMillis();
		for (int x = 0; x < 50000; x++) {
			arrayList.add(x);
		}
		long linkedListTA1 = System.currentTimeMillis();
		long linkedListTA = linkedListTA1 - linkedListTA0;

		long linkedListT0 = System.currentTimeMillis();
		for (int x = 0; x < 15000; x++) {
			Random gerador = new Random();
			int valorBusca = gerador.nextInt(15001);
			arrayList.get(valorBusca);
		}
		long linkedListT1 = System.currentTimeMillis();
		long linkedListT = linkedListT1 - linkedListT0;
		System.out.println("####################################################################################");
		System.out.println("'LinkedList'   |||" + criarTD(linkedListTA) + "|||" + criarTD(linkedListT));

		System.out.println("####################################################################################");
		if (linkedListT < arrayListT) {
			System.out.println("'LinkedList' é mais rapido para efetuar buscas em relação a 'ArrayList'.");
		} else {
			System.out.println("'ArrayList' é mais rapido para efetuar buscas em relação a 'LinkedList'.");
		}
	}

	public static String criarTD(long tempo) {
		String temp = new String(tempo + "");
		int tam = temp.length();

		int dif = 34 - tam;
		StringBuilder stringBuilder = new StringBuilder();
		Integer ta = (dif / 2);
		for (int x = 0, y = ta; x < y; x++) {
			stringBuilder.append(" ");
		}
		String r = stringBuilder.toString();
		stringBuilder.append(temp);
		stringBuilder.append(r);
		if (stringBuilder.toString().length() < 36) {
			stringBuilder.append(" ");
		}
		return stringBuilder.toString();
	}
}