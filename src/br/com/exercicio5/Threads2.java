package br.com.exercicio5;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Threads2 implements Runnable {

	@Override
	public void run() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(dateFormat.format(new GregorianCalendar().getTime()));
	}
}