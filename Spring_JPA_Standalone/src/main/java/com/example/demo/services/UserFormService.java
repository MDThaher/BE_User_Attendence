package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserFormRepo;
import com.example.demo.entity.UserForm;

@Component
public class UserFormService {
	
	@Autowired
	UserFormRepo formRepo;

	public List<UserForm> getAllUser() {
		
		List<UserForm> findAll = formRepo.findAll();
		
		return findAll;
	}

	public UserForm getUser(int id) {
		
		return this.formRepo.findById(id);
	
		
	}

	public UserForm adduserList(UserForm form) {
		UserForm form1 = null;
		boolean existsById = formRepo.existsById(form.getId());
		if ( existsById != true ) {
			form1 = this.formRepo.save(form);
		}
		return form1;
		
		 
	}

	public UserForm updateUser(UserForm form, int id) {
		UserForm userForm = null;
		
		UserForm findById = this.formRepo.findById(id);
		
		if (findById.getId() == id) {
			userForm = formRepo.save(form);
		}else {
			System.out.println("Id Not Matched");
		}
		
		return userForm;
	}

	public UserForm deleteUserForm(int id) {
		UserForm findById = this.formRepo.findById(id);
		this.formRepo.delete(findById);
		
		return findById;
	}
	


}
