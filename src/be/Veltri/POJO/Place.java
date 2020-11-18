package be.Veltri.POJO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Place implements Serializable {
	private static final long serialVersionUID = 4677653132418229865L;
	private int id;
	private String nom;
	private float prix;
	private Set<Representation> listeRepresentation = new HashSet<>();

	// Constructeurs
	public Place(int id, String nom, float prix) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
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

	public Set<Representation> getListeRepresentation() {
		return listeRepresentation;
	}

	public void setListeRepresentation(Set<Representation> listeRepresentation) {
		this.listeRepresentation = listeRepresentation;
	}
	
	public void addRepresentation(Representation representation){
		this.listeRepresentation.add(representation);
	}
	public void removeRepresentation(Representation representation){
		this.listeRepresentation.remove(representation);
	}

}
