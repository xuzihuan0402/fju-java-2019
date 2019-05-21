package com.tom.ii;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sales {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sales.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line != null) {
				//System.out.println(line);
				String[] takens = line.split(" ");
				if(takens.length ==2) {
					System.out.println(takens[0] + "/" + takens[1]);
					
					int n = Integer.parseInt(takens[1]);
					
					line = in.readLine();
			}
		} 
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
