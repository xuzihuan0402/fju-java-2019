package com.tom.ddd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";//生出字串物件，空字串
		while(!name.equals("q")) {
			System.out.println("Please enter item name:");
			name = scanner.nextLine();
			System.out.println("Please enter quantity:");
			int qty = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name,qty));
			//list all
			for(Item item : items) {
				System.out.println(item.name + "\t" + item.qty);
			}
			
		}
		
	}

}
