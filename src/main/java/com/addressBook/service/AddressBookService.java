package com.addressBook.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import com.addressBook.DTO.AddressBookDTO;
import com.addressBook.DTO.ResponseDTO;
import com.addressBook.model.AddressBookData;

public class AddressBookService implements IAddressBookService {
	
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressBookList = new ArrayList<AddressBookData>();
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, new AddressBookDTO("Raj","K2-47"));
		addressBookList.add(addressbookData);
		return addressBookList;
	
	}

	@Override
	public AddressBookData getAddressBookDataById(int Id) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(Id, new AddressBookDTO("Shivam","c-47"));
		return addressbookData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= null;
		addressBookData = new AddressBookData(0, addressBookDTO);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= new AddressBookData(3,addressBookDTO);
		
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int Id) {
		// TODO Auto-generated method stub
		
	}

}
