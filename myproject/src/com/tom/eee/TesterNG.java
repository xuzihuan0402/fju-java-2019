package com.tom.eee;

import java.util.Scanner;

public class TesterNG {

	public static void main(String[] args) {
		int bonus = 200000;
		Scanner scanner = new Scanner(System.in);
		boolean validate = false;
		String number = null;
		while(!validate) {
			System.out.print("多少人要分");
		    number = scanner.nextLine();
			//check number width is larger than 0 and smaller than 4
			if (number.length() <= 0&&number.length()>3) {
				System.out.println("数字长度必须在1到3位数");
				continue;//回到回圈最前面
			}else {
				boolean flag = false;
				for(int i =0;i<number.length();i++){
					char c = number.charAt(i);
					if(c<48 || c > 57) {
						System.out.println("数字中不可包含非法字元");
						flag = true;
						break;
					}
					}
				if(flag) {
					continue;
				}else {
					validate = true;
				}
				}
				int n = Integer.parseInt(number);   //转换形态
				int div = bonus/n;
				System.out.println("每个人得" + div);
			}
		}

}
