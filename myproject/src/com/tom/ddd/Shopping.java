package com.tom.ddd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Shopping {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>();
		Map<Integer, Integer> mapThing = new HashMap<>();
		Map<String, Integer> t=new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入需要购买的物品");
		String thing = sc.next();
		
		while(!thing.equals("end") ) {
		int i=0;
		map.put(i, thing);
		Scanner num = new Scanner(System.in);
		System.out.println("输入需要购买的物品的数量");
		int number = num.nextInt();
		mapThing.put(i, number);
		System.out.println(map.get(i)+mapThing.get(i));
		i++;
		System.out.println("输入需要购买的物品");
		thing = sc.next();
		
		t.put(thing, number);
		
		}
		
		System.out.println("end");
		System.out.println(t);

	}

}

