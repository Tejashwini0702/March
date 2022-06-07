package com.serialization;
import java.io.*;
class Employee implements Serializable{
	private static final long serialVersionUID = 1793476128640618959L;
	public static void emp() {
		System.out.println(" I'm a Employee ");
	}
	//fields
	int id;
	String name;
	String location;
	//constructor
	Employee(int id,String name,String location){
		this.id=id;
		this.name=name;
		this.location=location;
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
		System.out.println("Employee location is: "+location);
	}
//main method
	public static void main(String[] args) {
		Employee info=new Employee(499,"Tejashwini","Hyderabad");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("D:\\Employee.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(info);			
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}