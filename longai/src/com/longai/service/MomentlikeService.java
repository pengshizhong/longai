package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class MomentlikeService {
	@Autowired
	private MomentlikeDAO momentlikeDAO;

	public Momentlike findById(int id){
		return momentlikeDAO.findById(id);
	}
	public void save(Momentlike momentlike){
		momentlikeDAO.save(momentlike);
	}
	public void delete(Momentlike momentlike){
		momentlikeDAO.delete(momentlike);
	}
	public List<Momentlike> findAll(){
		return momentlikeDAO.findAll();
	}
}
