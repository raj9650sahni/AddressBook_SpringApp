package com.addressBook.DTO;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Name is Invalid")
	@NotEmpty(message = "Name cannot be null ")
	public String name;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$", message = "Address is Invalid")
	@NotEmpty(message = "Address cannot be null")
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
