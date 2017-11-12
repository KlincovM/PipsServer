package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the korisnik database table.
 * 
 */
@Entity
@NamedQuery(name="Korisnik.findAll", query="SELECT k FROM Korisnik k")
public class Korisnik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idKorisnik;

	private String aktivan;

	private double latKorisnika;

	private double lonKorisnika;

	private String uredjaKorisnika;

	//bi-directional many-to-one association to Broj
	@OneToMany(mappedBy="korisnik")
	private List<Broj> brojs;

	public Korisnik() {
	}

	public int getIdKorisnik() {
		return this.idKorisnik;
	}

	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}

	public String getAktivan() {
		return this.aktivan;
	}

	public void setAktivan(String aktivan) {
		this.aktivan = aktivan;
	}

	public double getLatKorisnika() {
		return this.latKorisnika;
	}

	public void setLatKorisnika(double latKorisnika) {
		this.latKorisnika = latKorisnika;
	}

	public double getLonKorisnika() {
		return this.lonKorisnika;
	}

	public void setLonKorisnika(double lonKorisnika) {
		this.lonKorisnika = lonKorisnika;
	}

	public String getUredjaKorisnika() {
		return this.uredjaKorisnika;
	}

	public void setUredjaKorisnika(String uredjaKorisnika) {
		this.uredjaKorisnika = uredjaKorisnika;
	}

	public List<Broj> getBrojs() {
		return this.brojs;
	}

	public void setBrojs(List<Broj> brojs) {
		this.brojs = brojs;
	}

	public Broj addBroj(Broj broj) {
		getBrojs().add(broj);
		broj.setKorisnik(this);

		return broj;
	}

	public Broj removeBroj(Broj broj) {
		getBrojs().remove(broj);
		broj.setKorisnik(null);

		return broj;
	}

}