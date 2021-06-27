package com.addressBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.addressBook.DTO.AddressBookDTO;
import com.addressBook.Exception.AddressBookException;
import com.addressBook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
	
	private List<AddressBookData> addressBookList = new ArrayList<>();
	
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	
	}

	@Override
	public AddressBookData getAddressBookDataById(int Id) {
		return addressBookList.stream().filter(list -> list.getId() == Id).findFirst()
				.orElseThrow(() -> new AddressBookException("Record not present"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= null;
		addressBookData = new AddressBookData(addressBookList.size() + 1, addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData( int Id,AddressBookDTO addressBookDTO) {
		AddressBookData addressData = this.getAddressBookDataById(Id);
		addressData.setName(addressBookDTO.name);
		addressData.setAddress(addressBookDTO.address);
		addressBookList.set(Id -1, addressData);
		return addressData;
	}

	@Override
	public void deleteAddressBookData(int Id) {
		addressBookList.remove(Id -1);
	}

}
