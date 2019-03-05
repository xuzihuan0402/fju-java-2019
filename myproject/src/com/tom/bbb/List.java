package com.tom.bbb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public final class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList weight = new ArrayList();//每日体重监控
		weight.add(60);
		weight.add(60);
		weight.add(58);
		weight.add(60);
		weight.add(60);
		weight.add(58);
		weight.add(57);
		weight.add(56);
		System.out.println(weight);
		
		
		HashSet<Integer> num = new HashSet();//课堂签到系统
		num.add(407570012);
		num.add(407570023);
		num.add(407570035);
		num.add(407570048);
		num.add(407570051);
		num.add(407570060);
		System.out.println(num);
		
		

	}

}
