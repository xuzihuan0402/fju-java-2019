package com.tom.ggg;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println("Please enter English:");
			Score english = new Score(scanner.nextLine());
			System.out.println("Please enter math:");
			Score math = new Score(scanner.nextLine());
			System.out.println((english.value + math.value)/2);
		} catch (ScoreFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(OutRangeException e) {
			e.printStackTrace();
		}
		
		

	}

}
