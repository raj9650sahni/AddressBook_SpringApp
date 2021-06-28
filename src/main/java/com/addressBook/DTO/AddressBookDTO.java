package com.addressBook.DTO;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@ToString
@Slf4j
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
	public String zipcode;

	@Pattern(regexp = "^[9][1][ ][6-9][0-9]{9}$", message = "PhoneNo is Invalid")
	@NotEmpty(message = "PhoneNo cannot be null")
	public String phoneNo;

	public AddressBookDTO(String address, String city, String state, String zipcode, String phoneNo, String name) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNo = phoneNo;
	}


}
