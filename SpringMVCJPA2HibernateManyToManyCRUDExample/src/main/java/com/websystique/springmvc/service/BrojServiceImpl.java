package com.websystique.springmvc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.model.Broj;

@Service("brojService")
@Transactional
public class BrojServiceImpl  implements BrojService
{

	@Override
	public Broj uzmiSlobodanBroj(int korisnikID, int aparatID, int salterID) {
		// TODO Auto-generated method stub
		return null;
	}

}
