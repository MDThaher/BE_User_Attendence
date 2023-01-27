package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class NipponUserLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empUsername;
	private String empPassword;
	private String empRole;
	
	
	
	
	public NipponUserLogin() {

	}



	public NipponUserLogin(int id, String empUsername, String empPassword, String empRole) {
		super();
		this.id = id;
		this.empUsername = empUsername;
		this.empPassword = empPassword;
		this.empRole = empRole;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmpUsername() {
		return empUsername;
	}




	public void setEmpUsername(String empUsername) {
		this.empUsername = empUsername;
	}




	public String getEmpPassword() {
		return empPassword;
	}




	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	




	public String getEmpRole() {
		return empRole;
	}




	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}




	@Override
	public String toString() {
		return "NipponUserLogin [id=" + id + ", empUsername=" + empUsername + ", empPassword=" + empPassword
				+ ", empRole=" + empRole + "]";
	}

	
	





	
	
	
	
}
