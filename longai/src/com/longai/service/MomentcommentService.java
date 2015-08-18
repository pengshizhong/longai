package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class MomentcommentService {
	@Autowired
	private MomentcommentDAO momentcommentDAO;

	public Momentcomment findById(int id){
		return momentcommentDAO.findById(id);
	}
	public void save(Momentcomment momentcomment){
		momentcommentDAO.save(momentcomment);
	}
	public void delete(Momentcomment momentcomment){
		momentcommentDAO.delete(momentcomment);
	}
	public List<Momentcomment> findAll(){
		return momentcommentDAO.findAll();
	}
}
