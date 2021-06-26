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
import com.addressBook.DTO.ResponseDTO;
import com.addressBook.model.AddressBookData;

@RestController
@RequestMapping("/addressBookApp")
public class AddressBookController {
	
	
	
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(1, new AddressBookDTO("raj", "K2-47"));
		ResponseDTO responseDTO = new ResponseDTO("get call Success", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{Id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("Id") int Id) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(Id, new AddressBookDTO("Sumit", "E-57"));
		ResponseDTO responseDTO = new ResponseDTO("get call Success for Id: " + Id , addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(5,addressBookDTO);
		ResponseDTO responseDTO= new ResponseDTO("Post Call Success ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
		
		
	}
	
	
	@PutMapping("/update/{Id}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("Id") int Id,@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(Id,addressBookDTO);
		ResponseDTO responseDTO= new ResponseDTO("Put Call Success ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
			}
	
	@DeleteMapping("/delete/{d}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("Id") int Id) {
		ResponseDTO responseDTO= new ResponseDTO("Delete call Succes",Id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}

}
