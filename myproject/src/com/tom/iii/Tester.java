package com.tom.iii;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		int n = Integer.parseInt("36");
			try {
				FileReader fr = new FileReader("aa.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
