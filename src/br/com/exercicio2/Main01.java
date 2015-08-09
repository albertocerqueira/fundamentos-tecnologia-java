package br.com.exercicio2;

public class Main01 {
	
	public static void main(String[] args) {
		int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		for (int x = 0, y = array.length; x < y; x++) {
			System.out.println(array[x]);
		}

		int tamanhoArray = array.length;
		for (int x = tamanhoArray, y = 0; x == y; x--) {
			System.out.println(array[x]);
		}
	}
}