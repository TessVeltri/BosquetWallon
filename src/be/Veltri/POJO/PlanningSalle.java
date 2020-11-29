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
	private Set<Artistes> listeArtistes = new HashSet<>();

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

	public Set<Artistes> getListeArtistes() {
		return listeArtistes;
	}

	public void setListeArtistes(Set<Artistes> listeArtistes) {
		this.listeArtistes = listeArtistes;
	}

	public void addArtistes(Artistes artistes) {
		this.listeArtistes.add(artistes);
	}

	public void removeArtistes(Artistes artistes) {
		this.listeArtistes.remove(artistes);
	}

}
