package be.Veltri.POJO;

import java.io.Serializable;

public class Categorie implements Serializable{
	private static final long serialVersionUID = 461917675324325531L;
	private int id;
	private String type;
	private float prix;
	private int nbrmaxplace;
	
	// Constructeurs
	public Categorie(int id, String type, float prix, int nbrmaxplace) {
		this.id = id;
		this.type = type;
		this.prix = prix;
		this.nbrmaxplace = nbrmaxplace;
	}
	public Categorie () {}
	
	// Accesseurs
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getNbrmaxplace() {
		return nbrmaxplace;
	}
	public void setNbrmaxplace(int nbrmaxplace) {
		this.nbrmaxplace = nbrmaxplace;
	}	
	
}
