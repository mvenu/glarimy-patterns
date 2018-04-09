package com.glarimy.directory.api.model;

import java.util.List;

public class Contact {
	private Name name;
	private List<Long> phoneNumbers;
	private String email;
	private Address homeAddress;
	private Address officeAddress;

	public Contact() {

	}

	public Contact(Name name, List<Long> phoneNumbers, String email, Address homeAddress, Address officeAddress) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.email = email;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

}
