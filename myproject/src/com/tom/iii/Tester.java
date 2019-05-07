package com.tom.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		File dir = new File("C:\\FJU2017ICTCAI(PV).csf");
		if(dir.exists()&&dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f : files) {
				if(f.isFile()) {
					System.out.println(f.getName());
				}
			}
		}
		File dd = new File(dir, "aaa");
		System.out.println(dd.mkdir());  //建立新资料夹
		System.out.println(dd.delete());  //删除资料夹
		
		
		
		
		/*
		File dir = new File("C:\\xampp");
		if(dir.exists()&&dir.isDirectory()) {
			String[] files = dir.list();
			for(String s :files) {
				System.out.println(s);  //印出所有
			}
		}
		*/
		
		
		
		
		/*File file = new File("aa.txt");
		 * if(file.exists()) {
			System.out.println(file.length());  //大小
			System.out.println(file.getAbsoluteFile());  //路径和全名
		}*/
		
		
		

	}

}
