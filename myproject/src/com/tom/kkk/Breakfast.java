package com.tom.kkk;

public class Breakfast extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Making breakfast");
			Thread.sleep(4000);
			System.out.println("Breakfast done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
