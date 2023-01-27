package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NipponAttendence;

@Repository
public interface NipponAttendenceRepo extends JpaRepository<NipponAttendence, Integer>{

	List<NipponAttendence> findAllByUserRole(String string);
	
	boolean existsByUserRole(String string);
	
	List<NipponAttendence> findAllByUserName(String string);
	
	public NipponAttendence findById(int id);
	
	
	

}
