package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class EnrollService {
	@Autowired
	private EnrollDAO enrollDAO;
	public Enroll findById(int id){
		return enrollDAO.findById(id);
	}
	public void save(Enroll enroll){
		enrollDAO.save(enroll);
	}
	public void delete(Enroll enroll){
		enrollDAO.delete(enroll);
	}
	public List<Enroll> findAll(){
		return enrollDAO.findAll();
	}
}
