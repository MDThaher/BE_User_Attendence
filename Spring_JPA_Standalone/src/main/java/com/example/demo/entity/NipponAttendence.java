package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NipponAttendence {
	
	@Id
	@GeneratedValue(strategy= GenerationType. AUTO, generator="native")
	private int id;
	private String userName;
	private String userRole;
	private String day;
	private String date;
	private String userStatus;
	
	public NipponAttendence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NipponAttendence(int id, String userName, String userRole, String day, String date, String userStatus) {
		super();
		this.id = id;
		this.userName = userName;
		this.userRole = userRole;
		this.day = day;
		this.date = date;
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "NipponAttendence [id=" + id + ", userName=" + userName + ", userRole=" + userRole + ", day=" + day
				+ ", date=" + date + ", userStatus=" + userStatus + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	

}
