package com.addressBook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.addressBook.DTO.AddressBookDTO;
import com.addressBook.DTO.ResponseDTO;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "address_book")
@NoArgsConstructor
public class AddressBookData {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressbook_id")
	private int Id;
	private String name;

	private String city;
	private String state;
	private Long zipcode;
	private String phoneNo;
	private String address;

	public AddressBookData( AddressBookDTO addressDTO) {

		super();
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


	


	
	
	


}
