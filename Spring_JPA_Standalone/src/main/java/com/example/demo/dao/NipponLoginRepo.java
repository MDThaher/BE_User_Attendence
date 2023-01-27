package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.NipponUserLogin;

public interface NipponLoginRepo extends JpaRepository<NipponUserLogin, Integer>{

	public NipponUserLogin findById(int id);
	
	public List<NipponUserLogin> findByEmpUsername(String str);

	public boolean existsByEmpUsernameAndEmpPassword(String str1, String str2);

	@Query("SELECT empUsername FROM NipponUserLogin")
	public List<String> getUserNameList();

	
	
}
