package br.com.string;

public class App1 {

	public static void main(String[] args) {
		String str = "Isto e uma String";
		String str2 = new String("Isto e uma String");
		String str3 = "Isto e uma String";
		
		if (str==str2) {
			System.out.println("S\u00e3o Iguais");
		} else {
			System.out.println("S\u00e3o Diferentes");
		}
		
		if (str.equals(str2)) {
			System.out.println("S\u00e3o Iguais");
		} else {
			System.out.println("S\u00e3o Diferentes");
		}
		
		if (str3==str) {
			System.out.println("S\u00e3o Iguais");
		} else {
			System.out.println("S\u00e3o Diferentes");
		}
		
		if (str3.equals(str)) {
			System.out.println("S\u00e3o Iguais");
		} else {
			System.out.println("S\u00e3o Diferentes");
		}
	}
}