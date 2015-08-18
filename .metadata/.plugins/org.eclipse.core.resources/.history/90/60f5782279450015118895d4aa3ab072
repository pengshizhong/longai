package com.longai.service;

import java.util.List;

import com.longai.dao.*;
import com.longai.model.*;

public class MomentlikeService {
	private MomentlikeDAO momentlikeDAO;
	public void setMomentlikeDAO(MomentlikeDAO momentlikeDAO) {
		this.momentlikeDAO=momentlikeDAO;
	}
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
