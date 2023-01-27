package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserForm;



public interface UserFormRepo extends JpaRepository<UserForm, Integer>{
	
	public UserForm findById(int id);

}
