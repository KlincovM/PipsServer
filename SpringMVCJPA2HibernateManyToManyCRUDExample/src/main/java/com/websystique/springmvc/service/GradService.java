package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Grad;

public interface GradService {
	
	Grad findById(int id);
	
	List<Grad> findAll();
}
