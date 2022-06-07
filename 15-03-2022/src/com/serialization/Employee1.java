package com.serialization;
import java.io.*;
public class Employee1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\Employee.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);			
			Employee e=(Employee)ois.readObject();
			System.out.println(e.id+ "  "  +e.name+  "   "  +e.location);
			ois.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
