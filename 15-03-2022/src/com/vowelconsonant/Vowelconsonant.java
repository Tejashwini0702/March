package com.vowelconsonant;
import java.util.*;
public class Vowelconsonant {
 public static void main(String[] args) {
	 System.out.println("Enter anything:  ");
	 @SuppressWarnings("resource")
	Scanner Sm=new Scanner(System.in);
	 int vCount =0; int cCount=0;
	 String str = Sm.nextLine();
	 str =str.toLowerCase();
	 for(int i=0;i < str.length(); i++) {
		 if(str.charAt(i) == 'a'  || str.charAt(i) == 'e'  || str.charAt(i) == 'i'  ||  str.charAt(i) == 'o'  ||  str.charAt(i) == 'u' ) {
			 vCount++;
		 }
		 else if(str.charAt(i) >= 'a'  &&  str.charAt(i) <= 'z') {
			 cCount++;
		 }
	 }
	 System.out.println("Number of vowels:  "+  vCount);
	 System.out.println("Number of consonants:  "+  cCount);
 }
}
