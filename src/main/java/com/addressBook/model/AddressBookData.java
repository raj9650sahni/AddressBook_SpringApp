package com.addressBook.model;

import com.addressBook.DTO.AddressBookDTO;

public class AddressBookData {
	
	private int Id;
	private String name;
	/*
	 * private String city; private String state; private Long zipcode; private long
	 * phoneNo;
	 */
	private String address;

	/*
	 * private String emailId;
	 */	
	public AddressBookData(int Id,AddressBookDTO addressDTO) {
		
		super();
		this.Id=Id;
		this.name = addressDTO.name;
		
		this.address = addressDTO.address;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	
	
	
	
	

}
