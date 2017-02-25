package org.utils;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown(10);
	}
	
	public static void countdown(int cnt) {
		
		if (cnt ==0)
			System.out.println("Liftoff");
		else {
			System.out.println(cnt);
			countdown(cnt-1);	
		}
	}
}
