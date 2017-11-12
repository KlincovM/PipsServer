package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the objekat database table.
 * 
 */
@Entity
@NamedQuery(name="Objekat.findAll", query="SELECT o FROM Objekat o")
public class Objekat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idObjekat;

	private int brojObjekta;

	private int brojSalterObjekta;

	private int postanskiBroj;

	private String ulicaObjekta;

	//bi-directional many-to-one association to Aparat
	@OneToMany(mappedBy="objekat")
	private List<Aparat> aparats;

	//bi-directional many-to-one association to Grad
	@ManyToOne
	@JoinColumn(name="idGradObjekatFk")
	private Grad grad;

	//bi-directional many-to-one association to Salter
	@OneToMany(mappedBy="objekat")
	private List<Salter> salters;

	public Objekat() {
	}

	public int getIdObjekat() {
		return this.idObjekat;
	}

	public void setIdObjekat(int idObjekat) {
		this.idObjekat = idObjekat;
	}

	public int getBrojObjekta() {
		return this.brojObjekta;
	}

	public void setBrojObjekta(int brojObjekta) {
		this.brojObjekta = brojObjekta;
	}

	public int getBrojSalterObjekta() {
		return this.brojSalterObjekta;
	}

	public void setBrojSalterObjekta(int brojSalterObjekta) {
		this.brojSalterObjekta = brojSalterObjekta;
	}

	public int getPostanskiBroj() {
		return this.postanskiBroj;
	}

	public void setPostanskiBroj(int postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}

	public String getUlicaObjekta() {
		return this.ulicaObjekta;
	}

	public void setUlicaObjekta(String ulicaObjekta) {
		this.ulicaObjekta = ulicaObjekta;
	}

	public List<Aparat> getAparats() {
		return this.aparats;
	}

	public void setAparats(List<Aparat> aparats) {
		this.aparats = aparats;
	}

	public Aparat addAparat(Aparat aparat) {
		getAparats().add(aparat);
		aparat.setObjekat(this);

		return aparat;
	}

	public Aparat removeAparat(Aparat aparat) {
		getAparats().remove(aparat);
		aparat.setObjekat(null);

		return aparat;
	}

	public Grad getGrad() {
		return this.grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	public List<Salter> getSalters() {
		return this.salters;
	}

	public void setSalters(List<Salter> salters) {
		this.salters = salters;
	}

	public Salter addSalter(Salter salter) {
		getSalters().add(salter);
		salter.setObjekat(this);

		return salter;
	}

	public Salter removeSalter(Salter salter) {
		getSalters().remove(salter);
		salter.setObjekat(null);

		return salter;
	}

}