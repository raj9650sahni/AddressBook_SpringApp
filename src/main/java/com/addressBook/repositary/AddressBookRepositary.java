package com.addressBook.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.addressBook.model.AddressBookData;
public interface AddressBookRepositary extends JpaRepository<AddressBookData,Integer> {
	

}
