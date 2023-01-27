package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserForm {
	
	@Id
	private int id;
	private String name;
	private String gender;
	private String address;
	private int pincode;
	private String city;
	private String state;
	private String email;
	
	public UserForm() {
		super();
	}
	
	public UserForm(int id, String name, String gender, String address, int pincode, String city, String state,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.email = email;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserForm [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", pincode="
				+ pincode + ", city=" + city + ", state=" + state + ", email=" + email + "]";
	}


	
	

}
