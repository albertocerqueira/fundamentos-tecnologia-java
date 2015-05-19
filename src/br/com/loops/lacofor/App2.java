package br.com.loops.lacofor;

public class App2 {

	public static void main(String[] args) {
		// array de int
		int[] arrayNotas = { 1, 67, 2, 5, 7, 9, 4, 18 };

		int total = 0;
		int i = 0;
		for (int nota : arrayNotas) {
			total += nota;
			i++;
			System.out.println("Nota " + i + ": " + nota);
		}

		System.out.println(total);
	}
}