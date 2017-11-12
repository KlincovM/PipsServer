package com.websystique.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Grad;

@Repository("gradDao")
public class GradDaoImpl extends AbstractDao<Integer, Grad> implements GradDao{

	@Override
	public Grad findById(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Grad> findAll() {
		// TODO Auto-generated method stub
		List<Grad> gradovi = getEntityManager()
				.createQuery("")
				.getResultList();
		return gradovi;
	}

}
