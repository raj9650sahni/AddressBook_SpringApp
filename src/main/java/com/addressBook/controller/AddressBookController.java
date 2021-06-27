package com.addressBook.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.addressBook.service.IAddressBookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressBookApp")
@Slf4j
public class AddressBookController {

	@Autowired
	IAddressBookService addressBookService;

	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> addressBookLis = null;
		addressBookLis = addressBookService.getAddressBookData();
		ResponseDTO responseDTO = new ResponseDTO("get call Success", addressBookLis);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);

	}

	@GetMapping("/get/{Id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("Id") int Id) {
		AddressBookData addressBookData = null;
		addressBookData = addressBookService.getAddressBookDataById(Id);
		ResponseDTO responseDTO = new ResponseDTO("get call Success for Id: " + Id, addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = addressBookService.createAddressBookData(addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Post Call Success ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);

	}

	@PutMapping("/update/{Id}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("Id") int Id,
			@Valid @RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = addressBookService.updateAddressBookData(Id, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Put Call Success ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{d}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("Id") int Id) {
		addressBookService.deleteAddressBookData(Id);
		ResponseDTO responseDTO = new ResponseDTO("Delete call Succes", Id);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

}
