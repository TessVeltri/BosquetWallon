package be.Veltri.POJO;

import java.io.Serializable;

public class Place implements Serializable {
	private static final long serialVersionUID = 4677653132418229865L;
	private int id;
	private String nom;
	private float prix;
	private Representation representation;

	// Constructeurs
	public Place(int id, String nom, float prix, Representation representation) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.representation = representation;
	}

	public Place() {
	}

	// Accesseurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Representation getRepresentation() {
		return representation;
	}

	public void setRepresentation(Representation representation) {
		this.representation = representation;
	}

}
