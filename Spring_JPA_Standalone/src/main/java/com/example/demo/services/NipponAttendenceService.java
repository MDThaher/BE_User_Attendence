package com.example.demo.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.NipponAttendenceRepo;
import com.example.demo.entity.NipponAttendence;

@Component
public class NipponAttendenceService {

	@Autowired
	NipponAttendenceRepo attendenceRepo;

	/*
	 * add new Attendence to all in NipponAttendence Table 
	 */
	public NipponAttendence addAttendenceToUser(NipponAttendence attendence) 
	{	
		return this.attendenceRepo.save(attendence);
	}

	public List<NipponAttendence> getAllUsersAttendenceList(String string) 
	{
		List<NipponAttendence> list = null;
		if(string == null) {
			list = this.attendenceRepo.findAll();
		}else {
			return this.attendenceRepo.findAllByUserRole(string);
		}
		return list;
	}

	public List<NipponAttendence> getUserListByName(String name) {
		
		return this.attendenceRepo.findAllByUserName(name);
	}

	public NipponAttendence deleteAttendenceByUserId(int id) {
		
		NipponAttendence findById = attendenceRepo.findById(id);
		if(id == findById.getId()) {
			attendenceRepo.delete(findById);
		}
		return findById;
	}

	public NipponAttendence updateUserByID(int id, NipponAttendence attendence) {
		
		
			this.attendenceRepo.save(attendence);

		
		return attendence;
	}

	public NipponAttendence getUserByID(int id) {
		// TODO Auto-generated method stub
		return this.attendenceRepo.findById(id);
	}
	
	
}
