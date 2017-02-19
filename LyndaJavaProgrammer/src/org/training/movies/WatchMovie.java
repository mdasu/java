package org.training.movies;

import java.util.Scanner;

public class WatchMovie {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String movieName = "";
		String rating = "";
		
		Movies movie1 = new Movies("Ben Hur","PG",1956,90);
		
		System.out.println(movie1.toString());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter movie details: ");
		movieName = scan.next();

		System.out.println("Enter movie rating: ");
		rating = scan.next();

		Movies movie2 = new Movies(movieName,rating,2000,40);
		System.out.println(movie2.toString());
		
	}

}
