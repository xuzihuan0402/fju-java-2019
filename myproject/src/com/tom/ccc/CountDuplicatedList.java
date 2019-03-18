package com.tom.ccc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountDuplicatedList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		
		
		System.out.println("\n例子1 - 计算'a'出现的次数");
		System.out.println("a : " + Collections.frequency(list, "a"));
	 
		
 
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String string = "BbB I have a good friend, we met each other when I was five years old. She is my neighbor and the first time";
        char[] cs = string.toCharArray();
        for (char c : cs)//遍历集合，取出每一个元素
        	{
        map.put(c, (map.get(c)==null?1:map.get(c)+1));//核心代码就这一段
        }
        System.out.println(map);

        
	
	}
        
        
}

     





