package com.tom.ii;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			Reader in = new InputStreamReader(fis);
			int n = in.read();
			while(n!=-1) {
			System.out.print((char)n);
			n = in.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
