package com.websystique.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.BrojDao;
import com.websystique.springmvc.model.Broj;

@Service("brojService")
@Transactional
public class BrojServiceImpl  implements BrojService
{
	
	@Autowired
	BrojDao brojDao;
	
	@Override
	public Broj uzmiSlobodanBroj(int aparatID, int korisnikID, int salterID) {
		// TODO Auto-generated method stub
		return brojDao.getFirstFreeNumber(aparatID, korisnikID, salterID);
	}

}
