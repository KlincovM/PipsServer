package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the salter database table.
 * 
 */
@Entity
@NamedQuery(name="Salter.findAll", query="SELECT s FROM Salter s")
public class Salter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSalter;

	private int redniBrojSaltera;

	private int zauzetoBrojeva;

	//bi-directional many-to-one association to Broj
	@OneToMany(mappedBy="salter")
	private List<Broj> brojs;

	//bi-directional many-to-one association to Objekat
	@ManyToOne
	@JoinColumn(name="idObjekatSalter")
	private Objekat objekat;

	public Salter() {
	}

	public int getIdSalter() {
		return this.idSalter;
	}

	public void setIdSalter(int idSalter) {
		this.idSalter = idSalter;
	}

	public int getRedniBrojSaltera() {
		return this.redniBrojSaltera;
	}

	public void setRedniBrojSaltera(int redniBrojSaltera) {
		this.redniBrojSaltera = redniBrojSaltera;
	}

	public int getZauzetoBrojeva() {
		return this.zauzetoBrojeva;
	}

	public void setZauzetoBrojeva(int zauzetoBrojeva) {
		this.zauzetoBrojeva = zauzetoBrojeva;
	}

	public List<Broj> getBrojs() {
		return this.brojs;
	}

	public void setBrojs(List<Broj> brojs) {
		this.brojs = brojs;
	}

	public Broj addBroj(Broj broj) {
		getBrojs().add(broj);
		broj.setSalter(this);

		return broj;
	}

	public Broj removeBroj(Broj broj) {
		getBrojs().remove(broj);
		broj.setSalter(null);

		return broj;
	}

	public Objekat getObjekat() {
		return this.objekat;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

}