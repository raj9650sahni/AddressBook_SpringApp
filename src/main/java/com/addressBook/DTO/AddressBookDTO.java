package com.addressBook.DTO;

public class AddressBookDTO {
	
	private String name;
	private String city;
	private String state;
	private Long zipcode;
	private  long phoneNo;
	private String address;
	private String emailId;
	public AddressBookDTO(String name, String city, String state, Long zipcode, long phoneNo, String address,String emailId) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNo = phoneNo;
		this.address = address;
		this.emailId=emailId;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String toString() {
		return "AddressBook [ name: " + name + ", city: " + city + ", state: " + state+ ", zipcode: " + zipcode + ", phone No: " + phoneNo + ", Address: " + address +  ", Emailid: " + emailId +  "]";
	}
	

}
