package org.training.realestate;

public class Property {
	private double askingPrice;
	private double lotSize;
	private String type;
	private int numBeds;
	private double numBaths;
	
	public Property(double askingPrice, double lotSize, String type) {
//		super();
		this.askingPrice = askingPrice;
		this.lotSize = lotSize;
		this.type = type;
	}
	
	public Property(double askingPrice, double lotSize, String type, int numBeds, double numBaths) {
	//	super();
		this.askingPrice = askingPrice;
		this.lotSize = lotSize;
		this.type = type;
		this.numBeds = numBeds;
		this.numBaths = numBaths;
	}
	
	public void setAskingPrice (double askingPrice) {
		this.askingPrice = askingPrice;
	}

	@Override
	public String toString() {
		return "Property [askingPrice=" + askingPrice + ", lotSize=" + lotSize + ", type=" + type + ", numBeds="
				+ numBeds + ", numBaths=" + numBaths + "]";
	}
	
}
