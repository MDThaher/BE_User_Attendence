package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.NipponUserLogin;
import com.example.demo.services.NipponUserLoginServices;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {
	
	@Autowired
	NipponUserLoginServices loginServices;
	
	
	/* *
	 * 
	 * 
	 * Getting All User from UserLogin Table
	 * 
	 * 
	 * */
	@GetMapping("getUsers")
	public List<NipponUserLogin> getUsers() {
		return this.loginServices.getAllUserLogins();
	}
	
	
	/* *
	 * 
	 * 
	 * Getting User By ID in UserLogin Table
	 * 
	 * 
	 * */
	@GetMapping("getUserByid/{id}")
	public NipponUserLogin getUserByID(@PathVariable int id) {
		return this.loginServices.getUserNameById(id);
	}
	
	
	/* *
	 * 
	 * 
	 * Getting User By username in UserLogin Table
	 * 
	 * 
	 * */
	@GetMapping("getUserByName/{str}")
	public List<NipponUserLogin> getuserbyName(@PathVariable String str){
		return this.loginServices.getUserByName(str);
		
	}
	
	
	
	/* *
	 * 
	 * 
	 * to add new User login in UserLogin Table
	 * 
	 * 
	 * */
	@PostMapping("addUserLogin")
	public NipponUserLogin addNewUser(@RequestBody NipponUserLogin userLogin){
		
		return this.loginServices.addNewUserLogin(userLogin);
	}
	
	@GetMapping("userValidation")
	public boolean validateUser(@RequestParam(value = "empUsername") String str1,
								@RequestParam(value = "empPassword") String str2) 
	{
		return this.loginServices.validateUser(str1, str2);
	}
	
	@GetMapping("getRoleByName/{name}")
	public String getRole(@PathVariable String name) {
		return this.loginServices.getRoleByname(name);
	}
	
	@GetMapping("GetUserNameList")
	public List<String> getUserNameList(){
		return this.loginServices.getUserNameList();
	}

}
