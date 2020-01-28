package com.ms.ms2;

public class GuestAddressDTO {

	private String city;
	private String state;
	private String country;

	public GuestAddressDTO(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

}
