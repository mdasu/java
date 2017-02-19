package org.training.realestate;

import java.util.ArrayList;

public class RealEstateListing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Property land = new Property(150000,15,"Land");
		
		Property home = new Property(250000,1,"Home",3,2.5);
		
		home.setAskingPrice(280000);
		
		System.out.println(land.toString());
		System.out.println(home.toString());
		
		ArrayList<Property> mls = new ArrayList<Property>();
		
		mls.add(land);
		System.out.println("ArrayList: " + mls.get(0));
	}

}
