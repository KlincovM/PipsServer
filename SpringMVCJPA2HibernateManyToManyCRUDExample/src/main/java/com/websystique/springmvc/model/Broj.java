package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the broj database table.
 * 
 */
@Entity
@NamedQuery(name="Broj.findAll", query="SELECT b FROM Broj b")
public class Broj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBroj;

	private byte aktivanBroj;

	private String datumUzimanja;

	private String vremeCekanja;

	private String vremeUzimanja;

	//bi-directional many-to-one association to Aparat
	@ManyToOne
	@JoinColumn(name="idAparatBroj")
	private Aparat aparat;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	@JoinColumn(name="idKorisnikBroj")
	private Korisnik korisnik;

	//bi-directional many-to-one association to Salter
	@ManyToOne
	@JoinColumn(name="idSalterBroj")
	private Salter salter;

	public Broj() {
	}

	public int getIdBroj() {
		return this.idBroj;
	}

	public void setIdBroj(int idBroj) {
		this.idBroj = idBroj;
	}

	public byte getAktivanBroj() {
		return this.aktivanBroj;
	}

	public void setAktivanBroj(byte aktivanBroj) {
		this.aktivanBroj = aktivanBroj;
	}

	public String getDatumUzimanja() {
		return this.datumUzimanja;
	}

	public void setDatumUzimanja(String datumUzimanja) {
		this.datumUzimanja = datumUzimanja;
	}

	public String getVremeCekanja() {
		return this.vremeCekanja;
	}

	public void setVremeCekanja(String vremeCekanja) {
		this.vremeCekanja = vremeCekanja;
	}

	public String getVremeUzimanja() {
		return this.vremeUzimanja;
	}

	public void setVremeUzimanja(String vremeUzimanja) {
		this.vremeUzimanja = vremeUzimanja;
	}

	public Aparat getAparat() {
		return this.aparat;
	}

	public void setAparat(Aparat aparat) {
		this.aparat = aparat;
	}

	public Korisnik getKorisnik() {
		return this.korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Salter getSalter() {
		return this.salter;
	}

	public void setSalter(Salter salter) {
		this.salter = salter;
	}

}