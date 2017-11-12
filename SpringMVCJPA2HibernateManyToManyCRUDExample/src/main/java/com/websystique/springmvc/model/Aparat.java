package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the aparat database table.
 * 
 */
@Entity
@NamedQuery(name="Aparat.findAll", query="SELECT a FROM Aparat a")
public class Aparat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAparat;

	private int redniBrojAparata;

	//bi-directional many-to-one association to Objekat
	@ManyToOne
	@JoinColumn(name="idObjekatAparat")
	private Objekat objekat;

	//bi-directional many-to-one association to Broj
	@OneToMany(mappedBy="aparat")
	private List<Broj> brojs;

	public Aparat() {
	}

	public int getIdAparat() {
		return this.idAparat;
	}

	public void setIdAparat(int idAparat) {
		this.idAparat = idAparat;
	}

	public int getRedniBrojAparata() {
		return this.redniBrojAparata;
	}

	public void setRedniBrojAparata(int redniBrojAparata) {
		this.redniBrojAparata = redniBrojAparata;
	}

	public Objekat getObjekat() {
		return this.objekat;
	}

	public void setObjekat(Objekat objekat) {
		this.objekat = objekat;
	}

	public List<Broj> getBrojs() {
		return this.brojs;
	}

	public void setBrojs(List<Broj> brojs) {
		this.brojs = brojs;
	}

	public Broj addBroj(Broj broj) {
		getBrojs().add(broj);
		broj.setAparat(this);

		return broj;
	}

	public Broj removeBroj(Broj broj) {
		getBrojs().remove(broj);
		broj.setAparat(null);

		return broj;
	}

}