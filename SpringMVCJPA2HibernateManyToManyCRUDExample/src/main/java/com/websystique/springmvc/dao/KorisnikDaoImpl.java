package com.websystique.springmvc.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Korisnik;

@Repository("korisnikDao")
public class KorisnikDaoImpl extends AbstractDao<Serializable, Korisnik> implements KorisnikDao{

}
