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
	
	@NotEmpty(message = "cannot be empty")
	public String city;
	
	@NotEmpty(message = "cannot be empty")
	public String state;
	
	@NotEmpty(message = "cannot be empty")
	public Long zipcode;
	
	@Pattern(regexp ="^[9][1][ ][6-9][0-9]{9}$", message = "PhoneNo is Invalid")
	@NotEmpty(message = "PhoneNo cannot be null")
	public String phoneNo;

	public AddressBookDTO(String address, String city, String state, Long zipcode, String phoneNo, String name) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNo = phoneNo;
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



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Long getZipcode() {
		return zipcode;
	}



	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String toString() {
		return "AddressBook [ name: " + name + ", city: " + city + ", state: " +
				  state+ ", zipcode: " + zipcode + ", phone No: " + phoneNo + ", Address: " +
				  address + "]";
				 	}

}


  
