package be.Veltri.POJO;

import java.io.Serializable;

public class Reservation implements Serializable{
	private static final long serialVersionUID = -3363407573648170262L;
	private int id;
	private float solde;
	private PlanningSalle planningsalle;
	private User user;
	
	// Constructeur
	public Reservation(int id, float solde, PlanningSalle planningsalle, User user) {
		this.id = id;
		this.solde = solde;
		this.planningsalle = planningsalle;
		this.user = user;
	}
	
	public Reservation() {}

	// Accesseurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public PlanningSalle getPlanningsalle() {
		return planningsalle;
	}

	public void setPlanningsalle(PlanningSalle planningsalle) {
		this.planningsalle = planningsalle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
