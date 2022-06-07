package com.StringMethods;
public class Substring {
	public static void main(String[] args) {
		/**
		 * substring(int beginIndex):
		 * 
		 * Returns a string that is a substring of this string.
		 * =================================
		 * substring(int beginIndex, int endIndex):
		 * 
		 * Returns a string that is a substring of this string.
		 */
		String text = "Welcome to Hyderabad, welcome to India.";

		System.out.println(text.substring(11));
		
		System.out.println(text.substring(22));
		
		System.out.println("====================");
		
		System.out.println(text.substring(11, 20));
		
		System.out.println(text.substring(33, 39));		
	}
}
