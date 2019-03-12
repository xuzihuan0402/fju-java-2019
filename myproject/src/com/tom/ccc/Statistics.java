package com.tom.ccc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);//数字随便给，47是种子seed，乱数产生基于前一个
		 Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		 for(int i = 0; i < 10000; i++) {
		 // Produce a number between 0 and 20:
		 int r = rand.nextInt(20);
		 Integer freq = m.get(r);
		 m.put(r, freq == null ? 1 : freq + 1);
		 }
		 System.out.println(m); 


	}

}
