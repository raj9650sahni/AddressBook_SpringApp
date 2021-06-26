package com.addressBook.DTO;

import javax.persistence.Id;

public class AddressBookDTO {
	
	public String name;
	public String address;
	
	
	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String toString() {
		return "AddressBook [  name: " + name + ", Address: " + address +  "]";
	}
	

}


/*
 * return "AddressBook [ name: " + name + ", city: " + city + ", state: " +
 * state+ ", zipcode: " + zipcode + ", phone No: " + phoneNo + ", Address: " +
 * address + ", Emailid: " + emailId + "]";
 */



/*
 * public String city; public String state; public Long zipcode; public long
 * phoneNo; public String emailId;
 */
