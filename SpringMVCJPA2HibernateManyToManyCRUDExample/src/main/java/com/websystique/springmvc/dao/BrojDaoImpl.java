package com.websystique.springmvc.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Broj;
import com.websystique.springmvc.model.Grad;

@Repository("brojDao")
public class BrojDaoImpl extends AbstractDao<Serializable, Broj> implements BrojDao{

	@Override
	public Broj getFirstFreeNumber(int idAparata, int idKorisnika, int idSaltera) {
		// TODO Auto-generated method stub
		StoredProcedureQuery createProcedure = entityManager.createStoredProcedureQuery("create_number");
		createProcedure.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
		createProcedure.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN); 
		createProcedure.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN); 
		createProcedure.setParameter(1, idAparata);
		createProcedure.setParameter(2, idKorisnika);
		createProcedure.setParameter(3, idSaltera);
		createProcedure.executeUpdate();
		Query query = entityManager.createQuery("from Broj b order by b.idBroj DESC");
		query.setMaxResults(1);
		Broj broj = (Broj)  query.getResultList().get(0);
		return broj;
	}

}
