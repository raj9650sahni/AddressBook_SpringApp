package com.addressBook.DTO;

import com.addressBook.model.AddressBookData;

import lombok.Data;

@Data
public class ResponseDTO {

	public String message;
	public Object data;

	public ResponseDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}

	

}
