package be.Veltri.POJO;

import java.io.Serializable;
import java.util.*;

public class Spectacle implements Serializable {
	private static final long serialVersionUID = -9134872159389324444L;
	private int id;
	private String titre;
	private int nbrplacemax;
	private PlanningSalle planningsalle;
	private Set<User> listartistes = new HashSet<>();

	// Constructeurs
	public Spectacle(int id, String titre, int nbrplacemax, PlanningSalle planningsalle, User user) {
		this.id = id;
		this.titre = titre;
		this.nbrplacemax = nbrplacemax;
		this.planningsalle = planningsalle;
	}

	public Spectacle() {
	}

	// Accesseurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbrplacemax() {
		return nbrplacemax;
	}

	public void setNbrplacemax(int nbrplacemax) {
		this.nbrplacemax = nbrplacemax;
	}

	public PlanningSalle getPlanningsalle() {
		return planningsalle;
	}

	public void setPlanningsalle(PlanningSalle planningsalle) {
		this.planningsalle = planningsalle;
	}

	public Set<User> getListartistes() {
		return listartistes;
	}

	public void setListartistes(Set<User> listartistes) {
		this.listartistes = listartistes;
	}

}
