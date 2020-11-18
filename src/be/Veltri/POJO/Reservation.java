package be.Veltri.POJO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Reservation implements Serializable{
	private static final long serialVersionUID = -3363407573648170262L;
	private int id;
	private float solde;
	private Set<PlanningSalle> listPlanningSalle = new HashSet<>();
	
	// Constructeur
	public Reservation(int id, float solde) {
		this.id = id;
		this.solde = solde;
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

	public Set<PlanningSalle> getListPlanningSalle() {
		return listPlanningSalle;
	}

	public void setListPlanningSalle(Set<PlanningSalle> listPlanningSalle) {
		this.listPlanningSalle = listPlanningSalle;
	}
	
	public void addPlanningSalle(PlanningSalle planningSalle){
		listPlanningSalle.add(planningSalle);
	}
	public void removePlanningSalle(PlanningSalle planningSalle){
		this.listPlanningSalle.remove(planningSalle);
	}
}
