package com.tom.kkk;

public class Main {

	public static void main(String[] args) {

        System.out.println("Hello World");
        Breakfast breakfast = new Breakfast();
        breakfast.start();

        BrushTeeth bt = new BrushTeeth();
        Thread thread = new Thread(bt);
        thread.start();
        try {
            thread.join();
            breakfast.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main end");
    }

}
