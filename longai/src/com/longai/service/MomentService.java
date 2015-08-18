package com.longai.service;

import java.util.List;

import com.longai.dao.*;
import com.longai.model.*;

public class MomentService {
	private MomentDAO momentDAO;
	public void setMomentDAO(MomentDAO momentDAO) {
		this.momentDAO=momentDAO;
	}
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
