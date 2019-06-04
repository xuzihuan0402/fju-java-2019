package com.tom.kkk;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Breakfast breakfast = new Breakfast();
        breakfast.start();

        BrushTeeth bt = new BrushTeeth();
        Thread thread = new Thread(bt);
        thread.start();
		

	}

}
