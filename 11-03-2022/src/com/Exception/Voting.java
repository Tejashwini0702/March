package com.Exception;

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String msg) {
		System.out.println(msg);
	}
}
   class Voting {
	   public static void main(String[] args) {
		   try {
			   vote(20);
		   }catch (Exception e) {
			   System.out.println(e);
		   }
	   }
	private static void vote(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Not Eligible For Voting");
					}
		else {
			System.out.println("Eligible For Voting");
		}
	}
}
