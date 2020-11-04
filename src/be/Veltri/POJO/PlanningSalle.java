package be.Veltri.POJO;

import java.io.Serializable;
import java.util.Date;

public class PlanningSalle implements Serializable {
	private static final long serialVersionUID = 2875279716052761652L;
	private int id;
	private Date datedebut;
	private Date datefin;
	private User user;

	// Constructeur
	public PlanningSalle(int id, Date datedebut, Date datefin, User user) {
		this.id = id;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
