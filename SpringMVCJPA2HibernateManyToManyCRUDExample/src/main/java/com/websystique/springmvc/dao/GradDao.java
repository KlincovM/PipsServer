package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Grad;

public interface GradDao {

	Grad findById(int id);

	List<Grad> findAll();

}
