package com.tom.eee;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int average =0;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("请输入数学成绩");
		int math = Integer .parseInt(sc.nextLine());
		if(math<0 || math >100) {
			average = math/0;
		}
		System.out.println("请输入英文成绩");
		int english = Integer .parseInt(sc.nextLine());
		if(english<0 || english >100) {
			average = english/0;
		}
		average = (math + english)/2;
		System.out.println("平均为" + average);
		}catch(NumberFormatException e) {
			System.out.println("讯息格式错误");
		}catch(ArithmeticException e) {
			System.out.println("讯息成绩应0~100");
		}
		

	}

}
