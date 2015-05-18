package br.com.fundamentos.date.gregoriancalendar;

import java.util.Date;
import java.util.GregorianCalendar;

public class App {
	
	public static void main(String[] args) {
		GregorianCalendar gCalendar = new GregorianCalendar(2012, 8, 20);
		System.out.println("Data " + gCalendar.getTime());
		
		GregorianCalendar gCalendarAgora = new GregorianCalendar();
		System.out.println("Data " + gCalendarAgora.getTime());
		
		gCalendar.add(GregorianCalendar.DAY_OF_MONTH, 2);
		System.out.println("Data " + gCalendar.getTime());
		
		Date dateAgora=new Date();
		GregorianCalendar gCalendarAgora2 = new GregorianCalendar();
		gCalendarAgora2.setTime(dateAgora);
		System.out.println("Data " + gCalendarAgora2.getTime());
		
		long difMili = gCalendarAgora.getTimeInMillis() - gCalendar.getTimeInMillis();
		System.out.println("Diferen\u00e7a entre datas em dias " + ((((difMili / 1000) / 60) / 60) / 24));
		
		while (gCalendar.before(gCalendarAgora)) {
			System.out.println("Acrescentar um dia...");
			gCalendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
			System.out.println("Data " + gCalendar.getTime());
			System.out.println("Data " + gCalendarAgora.getTime());
		}
		
		System.out.println("Data " + gCalendar.getTime());
	}
}