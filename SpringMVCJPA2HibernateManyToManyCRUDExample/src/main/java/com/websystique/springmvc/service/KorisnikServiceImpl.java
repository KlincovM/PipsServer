package com.websystique.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.KorisnikDao;

@Service("korisnikService")
@Transactional
public class KorisnikServiceImpl {
	
	@Autowired
	KorisnikDao korisnikDao;
}
