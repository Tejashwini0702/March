package com.multithreading;
public class Thread1  implements Runnable
{
       public void run() {
    	   System.out.println("Thread is running");
       }
	public static void main(String[] args) {
       Thread1 t1=new Thread1();
       Thread t=new Thread (t1);
        t.start();
	}

}
