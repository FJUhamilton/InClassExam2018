package com.exam;

public class Ticket {
	public Ticket(String string, String string2, String a, String b) {
		
		for (int i = 0; i < string.length(); i++) {
			char letter = string.charAt(i);
			System.out.print(letter); }
		    System.out.print(" ");
		for (int i = 0; i < string2.length(); i++) {
			char letter = string2.charAt(i);
			System.out.print(letter); }
			System.out.print(" ");
		for (int i = 0; i < a.length(); i++) {
			char letter = a.charAt(i);
			System.out.print(letter); }
			System.out.print(" ");
		for (int i = 0; i < b.length(); i++) {
			char letter = b.charAt(i);
			System.out.print(letter); }
			System.out.print(" ");
		System.out.println(" ");
}
}