package be.Veltri.POJO;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PlanningSalle implements Serializable {
	private static final long serialVersionUID = 2875279716052761652L;
	private int id;
	private Date datedebut;
	private Date datefin;
	private Set<Spectacle> listeSpectacle = new HashSet<>();

	// Constructeur
	public PlanningSalle(int id, Date datedebut, Date datefin) {
		this.id = id;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}

	public PlanningSalle() {
	}

	// Accesseurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	public Set<Spectacle> getListeSpectacle() {
		return listeSpectacle;
	}

	public void setListeSpectacle(Set<Spectacle> listeSpectacle) {
		this.listeSpectacle = listeSpectacle;
	}

	public void addSpectacle(Spectacle spectacle) {
		this.listeSpectacle.add(spectacle);
	}

	public void removeSpectacle(Spectacle spectacle) {
		this.listeSpectacle.remove(spectacle);
	}

}
