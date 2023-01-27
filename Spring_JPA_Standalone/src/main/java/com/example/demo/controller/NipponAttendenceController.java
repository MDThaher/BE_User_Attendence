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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.NipponAttendence;
import com.example.demo.services.NipponAttendenceService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NipponAttendenceController {

	@Autowired
	NipponAttendenceService attendenceService;
	
	
	
	
	/*
	 * add new Attendence to all in NipponAttendence Table 
	 */
	@PostMapping("addAttendence")
	public NipponAttendence markAttendence(@RequestBody NipponAttendence attendence) 
	{
		return this.attendenceService.addAttendenceToUser(attendence);
	}
	
	/*
	 * Get All Users Attendence List from NipponAttendence Table
	 */
	@GetMapping("getAllUsersAttendence")
	public List<NipponAttendence> getAllUsersAttendence(@RequestParam(value="userRole", required=false) String string) 
	{
		return this.attendenceService.getAllUsersAttendenceList(string);
	}
	
	
	/*
	 * 
	 * get All details by UserName
	 * 
	 * 
	 */
	@GetMapping("getTableListByUsername/{name}")
	public List<NipponAttendence> getListUsername(@PathVariable String name) {
		return this.attendenceService.getUserListByName(name);
	}
	
	/*
	 * 
	 * get Delete User Attendence by ID
	 * 
	 * 
	 */
	@DeleteMapping("getDeleteByID/{id}")
	public NipponAttendence deleteUserByID(@PathVariable int id) {
		return this.attendenceService.deleteAttendenceByUserId(id);
	}
	
	
	/*
	 * 
	 * get Update User By ID
	 * 
	 * 
	 */
	
	@PutMapping("updateUserById/{id}")
	public NipponAttendence updateUser(@PathVariable int id, @RequestBody NipponAttendence attendence) {
		return this.attendenceService.updateUserByID(id, attendence);
	}
	
	
	/*
	 * 
	 * get User By id 
	 * 
	 * 
	 */
	
	@GetMapping("getUserByID/{id}")
	public NipponAttendence getUserByID(@PathVariable int id) {
		return this.attendenceService.getUserByID(id);
		
	}
	
	
	
	
}
