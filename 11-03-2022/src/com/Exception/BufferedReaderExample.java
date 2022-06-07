package com.Exception;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class BufferedReaderExample {
		
		public static void main(String args[])throws Exception{             
		    InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);            
		    System.out.println("Enter your name");    
		    String name=br.readLine();    
		    System.out.println("Welcome "+name);    
		    System.out.println("Enter your age");    
		    int  age=Integer.parseInt(br.readLine());    
		    System.out.println("Your age"  +age);
		    
		}    
		}

