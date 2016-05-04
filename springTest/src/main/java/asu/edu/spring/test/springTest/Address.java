package asu.edu.spring.test.springTest;

public class Address {
	private String street;
	private String postCode;
	public Address(String street, String postCode) {
		this.street = street;
		this.postCode = postCode;
	}
	
	public Address() {
		
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}

}
