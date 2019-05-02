package com.tom.hhh;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
		System.out.println("Pizza想切几片？");
		String s = sc.nextLine();
		Piece num = new Piece(Integer.parseInt(s));
		System.out.println(num.n);
		}catch(NumberFormatException e) {
			System.out.println("格式错误");
		}catch(ZeroException e) {
			System.out.println("你确定不要切？");
		}catch(NumberExcpetion e) {
			System.out.println("数量错误");
		}catch(RightException e) {
			System.out.println("谢谢购物");
		}catch(RangeException e){
			System.out.println("输出范围");
		}
		
		
		
		
		
		
	}

}
