package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserForm;
import com.example.demo.services.UserFormService;

@CrossOrigin(origins = "*")
@RestController
public class UserFormController {

	@Autowired
	UserFormService formService;
	
	@GetMapping("UserFromAll")
	public List<UserForm> getAllUser() {
		return formService.getAllUser();
	}
	
	@GetMapping("userForm/{id}")
	public UserForm getById(@PathVariable int id) {
		return this.formService.getUser(id);
	}
	
	@PostMapping("addUserForm")
	public UserForm addUserForm(@RequestBody UserForm form) {
		return this.formService.adduserList(form);
	}
	
	@PutMapping("updateUserForm/{id}")
	public UserForm UpdateUser(@RequestBody UserForm form, @PathVariable int id) {
		return this.formService.updateUser(form, id);
	}
	
	@DeleteMapping("removeUser/{id}")
	public UserForm deleteForm(@PathVariable int id) {
		return this.formService.deleteUserForm(id);
	}
	
}
