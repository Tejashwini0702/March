package com.StringMethods;
public class ToCharArray {
	public static void main(String[] args) {
		/**
		 * toCharArray():
		 * 
		 * Converts this string to a new character array.
		 */

		String text = "Welcome to Telangana";

		char characters[] = text.toCharArray();
		
		for(char character: characters)
		{
			System.out.println(character);
		}
		
	}

}
