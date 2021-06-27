package com.addressBook.service;

import java.util.List;

import com.addressBook.DTO.AddressBookDTO;
import com.addressBook.model.*;

public interface IAddressBookService {
	

	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookDataById(int Id);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int Id,AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int Id);

}
