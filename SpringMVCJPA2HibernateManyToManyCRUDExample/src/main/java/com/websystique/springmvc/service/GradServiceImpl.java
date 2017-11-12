package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.GradDao;
import com.websystique.springmvc.model.Grad;

@Service("gradService")
@Transactional
public class GradServiceImpl implements GradService{

	@Autowired
	GradDao dao;

	@Override
	public Grad findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Grad> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	

}
