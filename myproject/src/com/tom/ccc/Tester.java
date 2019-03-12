package com.tom.ccc;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[]freqs = new int[20];
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<10000;i++) {
			int r= random.nextInt(20);
			list.add(r);
			freqs [r]++;
		}
		for(int i =0;i<freqs.length;i++) {
			System.out.println(i + ":" + freqs[i]);
		}

	}

}
