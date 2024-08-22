package com.wolters.SpringBasic.pojos;

public class Employee {
	private String name;
	private int id;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Employee Info:\n" + "\nName - " + getName() + "\nEmp ID - " + getId() + "\nAddress - "
				+ getAddress().getCity() + ", " + getAddress().getCountry() + ", PinCode- "
				+ getAddress().getPincode());
	}

}
