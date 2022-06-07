package com.Threads;

public class Account {
   public int balance;
   public int accountNo;
   void displaybalance() {
	   System.out.println("Account No:"+accountNo+"Balance :" + balance);
   }
   synchronized void deposit(int amount) {
	   balance = balance + amount;
	   System.out.println(amount + " is deposited");
	   displaybalance();
   }
   synchronized void Withdraw(int amount) {
	   balance=balance-amount;
	   System.out.println(amount+" is withdrawn");
	   displaybalance();
   }
   }
    class TransactionDeposit implements Runnable{
	int amount;
	Account accountX;
	TransactionDeposit(Account x,int amount){
		accountX=x;
		this.amount=amount;
		new Thread(this).start();
	}
	public void run() {
		accountX.deposit(amount);
	}
}
    class TransactionWithdraw implements Runnable{
    	int amount;
    	Account accountY;
    	TransactionWithdraw(Account y,int amount){
    		accountY=y;
    		this.amount=amount;
    		new Thread(this).start();
    	}
    	public void run() {
    		accountY.Withdraw(amount);
    	}
    }
    class Bankoperation{
    	public static void main(String[] args)
    	{
    		Account ABC=new Account();
    		ABC.balance= 2000;
    		ABC.accountNo= 123;
    		new TransactionDeposit(ABC,500);
    		new TransactionWithdraw(ABC,800);
    	}
    }
