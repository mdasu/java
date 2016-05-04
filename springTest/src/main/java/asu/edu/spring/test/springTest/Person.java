package asu.edu.spring.test.springTest;

public class Person {
	private int ID;
	private String name;
	private int taxId;
	private Address address;
	
	public void speak() {
		System.out.println("Hello...");
	}

	public Person(int ID, String name) {
		this.ID = ID;
		this.name = name; 
	}
	
	public Person() {
		
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

}
