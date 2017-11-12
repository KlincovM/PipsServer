package com.websystique.springmvc.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Objekat;

@Repository("objekatDao")
public class ObjekatDaoImpl extends AbstractDao<Serializable, Objekat> implements ObjekatDao {

}
