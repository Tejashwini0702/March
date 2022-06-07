package com.StringMethods;
public class Startswith {
	public static void main(String[] args) {
		/**
		 * startsWith(String prefix):
		 * 
		 * Tests if this string starts with the specified prefix.
		 */
		String text = "Welcome to Telangana, welcome to India.";

		System.out.println(text.startsWith("to"));

		System.out.println(text.startsWith("Welcome"));

		System.out.println(text.startsWith("Welcome to Telangana,"));
		
		System.out.println(text.startsWith("welcome to India."));		
	}
}
