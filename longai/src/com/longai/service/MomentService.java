package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class MomentService {
	@Autowired
	private MomentDAO momentDAO;

	public Moment findById(int id){
		return momentDAO.findById(id);
	}
	public void save(Moment moment){
		momentDAO.save(moment);
	}
	public void delete(Moment moment){
		momentDAO.delete(moment);
	}
	public List<Moment> findAll(){
		return momentDAO.findAll();
	}
}
