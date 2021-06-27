package com.addressBook.model;

import com.addressBook.DTO.AddressBookDTO;
import com.addressBook.DTO.ResponseDTO;

public class AddressBookData {

	private int Id;
	private String name;

	private String city;
	private String state;
	private Long zipcode;
	private String phoneNo;
	private String address;

	public AddressBookData(int Id, AddressBookDTO addressDTO) {

		super();
		this.Id = Id;
		this.updateAddressBookData(addressDTO);
	}
	
	
	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		
		this.name = addressBookDTO.name;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zipcode = addressBookDTO.zipcode;
		this.phoneNo = addressBookDTO.phoneNo;
		this.address = addressBookDTO.address;
		
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	
	


}
