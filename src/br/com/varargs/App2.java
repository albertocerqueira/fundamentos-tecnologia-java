package br.com.varargs;

public class App2 {

	public static void main(String[] args) {
		foo("Java", "Oracle", "Linux");
		foo("S\u00e3o Paulo", "Jundia\u00ed", "Campinas", "Tatu\u00ed");

		Object aluno = new Aluno("Tom\u00e1s", 11);
		Object aluno2 = new Aluno("Bastos", 21);

		foo(aluno, aluno2);
	}

	public static void foo(Object... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}