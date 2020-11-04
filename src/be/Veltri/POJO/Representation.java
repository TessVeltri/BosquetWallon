package be.Veltri.POJO;

import java.io.Serializable;
import java.util.Date;

public class Representation implements Serializable {
	private static final long serialVersionUID = 5775215245470179538L;
	private int id;
	private Date datedebut;
	private Date datefin;
	private Spectacle spectacle;

	// Constructeurs
	public Representation(int id, Date datedebut, Date datefin, Spectacle spectacle) {
		this.id = id;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.spectacle = spectacle;
	}

	public Representation() {
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

	public Spectacle getSpectacle() {
		return spectacle;
	}

	public void setSpectacle(Spectacle spectacle) {
		this.spectacle = spectacle;
	}

}
