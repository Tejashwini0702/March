package com.settersAndGettersMethods;
public class Employee {
	int id;
	String name;
	double salary;
	//setters and getters method	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {		
		Employee employee = new Employee();	
		//set values to the object using setter methods
		employee.setId(5248);
		employee.setName("Raju Reddy");
		employee.setSalary(42568.89);		
		//print values on the screen using getter methods
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());			
	}
}
