package com.addressBook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressBook.DTO.AddressBookDTO;

@RestController
@RequestMapping("/addressBookApp")
public class AddressBookController {
	
	
	
	@GetMapping("/get")
	public ResponseEntity<String> getAddressBookData() {
		return new ResponseEntity<String>("Get call Success : ",HttpStatus.OK);
	}
	
	@GetMapping("/get/{name}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("name") String name) {
		return new ResponseEntity<String>("Get call Success for name: " + name,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		return new ResponseEntity<String>("AddressBook Data is : " + addressBookDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{personId}")
	public ResponseEntity<String> updateAddressBookData(@PathVariable("personId") int personId,@RequestBody AddressBookDTO addressBookDTO) {
		return new ResponseEntity<String>("Update call for " + personId + " :" + addressBookDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{personId}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("personId") int personId) {
		return new ResponseEntity<String>("delete call succes for  :" + personId,HttpStatus.OK);
	}

}
