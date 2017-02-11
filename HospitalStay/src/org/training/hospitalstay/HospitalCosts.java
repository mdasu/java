package org.training.hospitalstay;

import java.util.Scanner;

/* Okay, it's time again for our challenge. The challenge objectives for this section are to add decision-making logic and
 *  use a loop to allow the program to continue multiple times. You want to write a program that computes and displays the 
 *  total charges for our patient in a hospital stay. The patient might be admitted overnight. For an overnight stay, you're 
 *  going to ask the user for the hospital overnight charges, as well as medication charges and lab service charges.

If it's not an overnight stay, then you're just going to have medication charges and lab service charges. You're going to 
calculate the charges, print the final total, then ask the user if they want to calculate the charges for another patient.
*/

public class HospitalCosts {

	public static void main(String[] args) {

		int totalCharges = 0;
		int dayCharges = 0;
		int nightCharges = 0;
		boolean loop = true;
		
		// TODO Auto-generated method stub
		while (loop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter lab and med charges: ");
			dayCharges = scan.nextInt();

			System.out.println("Did you have an overnight stay (enter Y or N):");
			String overnightStay = scan.next();

			if (overnightStay.equals("Y")) {
				System.out.println("You had an overnight stay.");
				System.out.println("Enter overnight charges: ");
				nightCharges = scan.nextInt();
			}
  
			totalCharges = 0;
			totalCharges = dayCharges + nightCharges;

			System.out.println("Your total charges are: " + Integer.toString(totalCharges));
			System.out.println("End of job...");

			System.out.println("Do you want to process another person? (enter Y or N):");
			String continueLoop = scan.next();

			if (!continueLoop.equals("Y")) {
				scan.close();
				loop = false;
			}			
		}
	}

}
