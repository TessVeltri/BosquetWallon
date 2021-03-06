package be.Veltri.POJO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Commande implements Serializable{
	private static final long serialVersionUID = -4937045767436114258L;
	private int id;
	private User user;
	private String modelivraison;
	private String modepaiement;
	private float totalcommande;
	private Set<Place> listePlace= new HashSet<>();
	
	// Constructeur
	public Commande(int id, User user, String modelivraison, String modepaiement, float totalcommande) {
		this.id = id;
		this.user = user;
		this.modelivraison = modelivraison;
		this.modepaiement = modepaiement;
		this.totalcommande = totalcommande;
	}
	public Commande () {}
	
	// Accesseurs
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getModelivraison() {
		return modelivraison;
	}
	public void setModelivraison(String modelivraison) {
		this.modelivraison = modelivraison;
	}
	public String getModepaiement() {
		return modepaiement;
	}
	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}
	public float getTotalcommande() {
		return totalcommande;
	}
	public void setTotalcommande(float totalcommande) {
		this.totalcommande = totalcommande;
	}
	public Set<Place> getListePlace() {
		return listePlace;
	}
	public void setListePlace(Set<Place> listePlace) {
		this.listePlace = listePlace;
	}
	public void addPlace(Place place){
		this.listePlace.add(place);
	}
	public void removePlace(Place place){
		this.listePlace.remove(place);
	}

	
	
	
}
