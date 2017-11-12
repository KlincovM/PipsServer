package com.websystique.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.ObjekatDao;

@Service("objekatService")
@Transactional
public class ObjekatServiceImpl implements ObjekatService{

	@Autowired
	ObjekatDao objekatDao;
}
