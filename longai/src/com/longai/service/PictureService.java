package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class PictureService {
	@Autowired
	private PictureDAO pictureDAO;

	public Picture findById(int id){
		return pictureDAO.findById(id);
	}
	public void save(Picture picture){
		pictureDAO.save(picture);
	}
	public void delete(Picture picture){
		pictureDAO.delete(picture);
	}
	public List<Picture> findAll(){
		return pictureDAO.findAll();
	}
}
