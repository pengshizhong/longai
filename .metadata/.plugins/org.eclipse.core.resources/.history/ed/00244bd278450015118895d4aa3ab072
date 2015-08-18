package com.longai.service;

import java.util.List;

import com.longai.dao.*;
import com.longai.model.*;

public class EnrollService {
	private EnrollDAO enrollDAO;
	public void setEnrollDAO(EnrollDAO enrollDAO) {
		this.enrollDAO=enrollDAO;
	}
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
