package com.tom.kkk;

public class Wizard extends Thread{
	
	@Override
	public void run() {
		thunder();
		}
	 public synchronized void thunder(){
		 System.out.println("THUNDER!!");
		 try {
			 sleep(2000);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		 System.out.println("END");
		 }
	
	
	
	
			
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		Thread t1 = new Thread(w1);
		t1.start();
		Wizard w2 = new Wizard();
		Thread t2 = new Thread(w2);
		t2.start();
		}

}
