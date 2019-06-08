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
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
		}

}
