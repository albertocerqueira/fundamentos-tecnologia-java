package br.com.exercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main02 {

	public static void main(String[] args) throws ParseException {
		// Date d = new Date();
		// SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		// System.out.println(format.format(d));

		Date date = new Date(112, 8, 10, 12, 0);

		SimpleDateFormat format01 = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		System.out.println(format01.format(date));

		SimpleDateFormat format02 = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		System.out.println(format02.format(date));

		SimpleDateFormat format03 = new SimpleDateFormat("EEEEEEE");
		System.out.println(format03.format(date));

		SimpleDateFormat format04 = new SimpleDateFormat("yyyy");
		System.out.println(format04.format(date));

		SimpleDateFormat format05 = new SimpleDateFormat("GG");
		System.out.println(format05.format(date));
	}
}