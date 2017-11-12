package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Broj;

public interface BrojService {

	public Broj uzmiSlobodanBroj(int korisnikID, int aparatID, int salterID);
}
