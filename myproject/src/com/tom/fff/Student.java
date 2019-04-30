package com.tom.fff;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int average =0;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("请输入数学成绩");
		int math = Integer .parseInt(sc.nextLine());
		Score m = new Score();
		m.testException(math);
		System.out.println("请输入英文成绩");
		int english = Integer .parseInt(sc.nextLine());
		Score e = new Score();
		e.testException(english);
		average = (math + english)/2;
		}catch(NumberFormatException e) {
			//e.printStackTrace();  //出错的地方、原因
			System.out.println("讯息格式错误");
		}catch(MyException e) {
			System.out.println("讯息成绩应0~100");
		}
		
		System.out.println("平均为" + average);

	}

}