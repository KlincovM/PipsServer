package com.websystique.springmvc.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Salter;

@Repository("salterDao")
public class SalterDaoImpl extends AbstractDao<Serializable, Salter> implements SalterDao{

}
