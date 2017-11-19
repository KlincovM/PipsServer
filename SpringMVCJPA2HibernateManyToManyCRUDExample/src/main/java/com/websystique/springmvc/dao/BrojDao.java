package com.websystique.springmvc.dao;

import javax.transaction.Transactional;

import com.websystique.springmvc.model.Broj;

public interface BrojDao {
	
	
	public Broj getFirstFreeNumber(int idAparata, int idKorisnika, int idSaltera);
}
