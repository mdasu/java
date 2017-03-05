package org.training.groceries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Groceries {
	
	public static void main (String[] args) {
		
		boolean found = false;

		List<String> groceries = new ArrayList<String>();
		groceries.add("Broccoli");
		groceries.add("Kale");
		groceries.add("Bread");
		groceries.add("Beans");
		groceries.add("Apples");
	
		//boolean found = groceries.contains("Kale");
		//System.out.println(found);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter food to search for: ");
		String food = scan.next();
		
		for (Iterator iterator = groceries.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (food.toLowerCase().equals(string.toLowerCase())) {
				System.out.println(string + " was found!");	
				found = true;
			}
			System.out.println(string);
		}
		if (!found) {
			groceries.add(food);
		}
		System.out.println("Final grocery list");
		for  (int i = 0; i < groceries.size(); i++) {
			System.out.println(groceries.get(i));
		}
	}
}
