package com.ms.ms2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms2")
public class GuestAddressWebservice {

	@GetMapping("/guest/address/{id}")
	public GuestAddressDTO getGuestAddress(@PathVariable("id") String id) {
		
		GuestAddressDTO dto = new GuestAddressDTO(id+" City Modified", id+" State", id+" Country");
		return dto;
	}

}
