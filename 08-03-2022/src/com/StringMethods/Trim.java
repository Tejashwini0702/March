package com.StringMethods;
public class Trim {
	public static void main(String[] args) {
		/**
		 * trim(): 
		 * Returns a string whose value is this string, with any leading and 
		 * trailing whitespace removed.
		 */
		String text = " Welcome  to  Hyderabad ";

		System.out.println("Length: "+text.length());
		
		System.out.println(text);	
		
		System.out.println("========================");
		
		String text1 = text.trim();//trim() method applied
		
		System.out.println("Length: "+text1.length());
		
		System.out.println(text1);	
	}
}
