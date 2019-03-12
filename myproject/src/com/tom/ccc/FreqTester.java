package com.tom.ccc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FreqTester {

	public static void main(String[] args) {
		// 使用List實作，產生一萬個0到19之間的亂數，計算0到19出現的頻率，並印出結果。
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<20;i++) {
			list.add(0);
		}
		for(int i=0;i<10000;i++) {
			int r = random.nextInt(20);
			Integer freq = list.get(r);
			//Integer freq = list.contains(r) ? list.get(r)+1 : 1;
			//Integer freq = list.get(r);
			list.set(r, freq+1);
		}
		System.out.println(list);

	}

}
