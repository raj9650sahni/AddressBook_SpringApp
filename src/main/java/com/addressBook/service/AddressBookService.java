package com.addressBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressBook.DTO.AddressBookDTO;
import com.addressBook.Exception.AddressBookException;
import com.addressBook.model.AddressBookData;
import com.addressBook.repositary.AddressBookRepositary;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
	

	@Autowired
	private AddressBookRepositary addressbookRepositary;
	
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressbookRepositary.findAll();
	
	}

	@Override
	public AddressBookData getAddressBookDataById(int Id) {
		return addressbookRepositary.findById(Id).orElseThrow(
				() -> new AddressBookException("AddressBook with address id : " + Id + " does not exists "));	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(addressBookDTO);
		log.debug("AddressBook data : " + addressBookData.toString());
		return addressbookRepositary.save(addressBookData);
	}

	@Override
	public AddressBookData updateAddressBookData( int Id,AddressBookDTO addressBookDTO) {
		AddressBookData addressData = this.getAddressBookDataById(Id);
		addressData.updateAddressBookData(addressBookDTO);
		return addressbookRepositary.save(addressData);
	}

	@Override
	public void deleteAddressBookData(int Id) {
		AddressBookData addressBookDataById = this.getAddressBookDataById(Id);
		addressbookRepositary.delete(addressBookDataById);	}

}
