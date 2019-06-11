package com.tom.lll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		ArrayList<String> postCodes = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("data.txt"));
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				String[] tokens = line.split("¡A");
				if() {
					cities.add(tokens[0]);
				}
				areas.add(tokens[1]);
				postCodes.add(tokens[2]);
				
				line = in.readLine();
			}
		} catch (FileNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cities);

	}

}
