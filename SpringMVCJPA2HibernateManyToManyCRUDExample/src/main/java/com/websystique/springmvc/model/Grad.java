package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grad database table.
 * 
 */
@Entity
@NamedQuery(name="Grad.findAll", query="SELECT g FROM Grad g")
public class Grad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGrad;

	private int brojObjekataSaSistemom;

	@Lob
	private byte[] brojStanovnika;

	private double latGrad;

	private double lonGrad;

	private String nazivGrada;

	//bi-directional many-to-one association to Objekat
	@OneToMany(mappedBy="grad")
	private List<Objekat> objekats;

	public Grad() {
	}

	public int getIdGrad() {
		return this.idGrad;
	}

	public void setIdGrad(int idGrad) {
		this.idGrad = idGrad;
	}

	public int getBrojObjekataSaSistemom() {
		return this.brojObjekataSaSistemom;
	}

	public void setBrojObjekataSaSistemom(int brojObjekataSaSistemom) {
		this.brojObjekataSaSistemom = brojObjekataSaSistemom;
	}

	public byte[] getBrojStanovnika() {
		return this.brojStanovnika;
	}

	public void setBrojStanovnika(byte[] brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}

	public double getLatGrad() {
		return this.latGrad;
	}

	public void setLatGrad(double latGrad) {
		this.latGrad = latGrad;
	}

	public double getLonGrad() {
		return this.lonGrad;
	}

	public void setLonGrad(double lonGrad) {
		this.lonGrad = lonGrad;
	}

	public String getNazivGrada() {
		return this.nazivGrada;
	}

	public void setNazivGrada(String nazivGrada) {
		this.nazivGrada = nazivGrada;
	}

	public List<Objekat> getObjekats() {
		return this.objekats;
	}

	public void setObjekats(List<Objekat> objekats) {
		this.objekats = objekats;
	}

	public Objekat addObjekat(Objekat objekat) {
		getObjekats().add(objekat);
		objekat.setGrad(this);

		return objekat;
	}

	public Objekat removeObjekat(Objekat objekat) {
		getObjekats().remove(objekat);
		objekat.setGrad(null);

		return objekat;
	}

}