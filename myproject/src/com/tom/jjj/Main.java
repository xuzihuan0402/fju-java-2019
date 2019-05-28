package com.tom.jjj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horse h1 = new Horse("H1:");
		h1.start();
		Horse h2 = new Horse("H2:");
		h2.start();
		
		/*
		HorseRunnable h1 = new HorseRunnable();
		Thread thread = new Thread(h1);
		thread.start();
		*/
		
		/*for(int i= 1;i<=10000;i++) {
			System.out.println("House1 :" + i);
			
		}*/
		
		System.out.println("Main end");

	}

}
