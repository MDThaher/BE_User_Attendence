package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.NipponLoginRepo;
import com.example.demo.entity.NipponUserLogin;

@Component
public class NipponUserLoginServices {

	@Autowired
	NipponLoginRepo nipponLoginRepo;
	
	
	
	/* *
	 * 
	 * 
	 * Getting User By ID in UserLogin Table
	 * 
	 * 
	 * */
	public NipponUserLogin getUserNameById(int a) 
	{
		 
		return this.nipponLoginRepo.findById(a);

	}
	
	
	/* *
	 * 
	 * 
	 * Getting User By username in UserLogin Table
	 * 
	 * 
	 * */
	public List<NipponUserLogin> getUserByName(String str)
	{
		// TODO Auto-generated method stub
		return this.nipponLoginRepo.findByEmpUsername(str);
	}

	/* *
	 * 
	 * 
	 * to add new User login in UserLogin Table
	 * 
	 * 
	 * */
	public NipponUserLogin addNewUserLogin(NipponUserLogin userLogin) {
		// TODO Auto-generated method stub
		return nipponLoginRepo.save(userLogin);
	}


	
	/* *
	 * 
	 * 
	 * Getting All User from UserLogin Table
	 * 
	 * 
	 * */
	public List<NipponUserLogin> getAllUserLogins() {
		// TODO Auto-generated method stub
		return this.nipponLoginRepo.findAll();
	}


	public boolean validateUser(String str1, String str2) {
		return this.nipponLoginRepo.existsByEmpUsernameAndEmpPassword(str1,str2);
	}


	public String getRoleByname(String name) {
		// TODO Auto-generated method stub
		List<NipponUserLogin> findByEmpUsername = nipponLoginRepo.findByEmpUsername(name);
		String empRole = findByEmpUsername.get(0).getEmpRole();
		 return empRole;
	}
	
	
	public List<String> getUserNameList() {
		return this.nipponLoginRepo.getUserNameList();
	}


	

	
	
	

}
