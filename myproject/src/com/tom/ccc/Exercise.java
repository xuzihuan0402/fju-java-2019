package com.tom.ccc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Map<Integer, Integer>m = new HashMap<>();
		for (int i = 0;i<10000;i++) {
			int r = rand.nextInt(20);
			Integer value = m.get(r);
			if(value==null) {
				value = 1;
			}else {
				value = value+1;
			}
			m.put(r, value);
		}
		System.out.println(m);

	}

}
