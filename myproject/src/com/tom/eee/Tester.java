package com.tom.eee;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int bonus = 200000;
		int div = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("多少人要分");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);   //转换形态
			div = bonus/n; 
			System.out.println("每个人得" + div);  //都对了
		}catch(Exception e) {  //上层类别包含下层类别
			System.out.println("资料错误");
		}
		/*}catch(ArithmeticException e) {
			System.out.println("数值运算错误");
		}catch(NumberFormatException e) {
			System.out.println("数字格式错误");
		}*/
		
		

	}

}
