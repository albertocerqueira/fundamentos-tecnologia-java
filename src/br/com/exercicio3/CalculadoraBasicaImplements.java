package br.com.exercicio3;

public class CalculadoraBasicaImplements implements CalculadoraBasica {

	@Override
	public float somar(float op1, float op2) {
		return op1 + op2;
	}

	@Override
	public float subtrair(float op1, float op2) {
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2) {
		if (op1 == 0) {
			System.out.println("Dado inv\u00e1lido na divis\u00e3o");
			return 0;
		} else {
			return op2 / op1;
		}
	}

	@Override
	public float multiplicar(float op1, float op2) {
		return op1 * op2;
	}
}