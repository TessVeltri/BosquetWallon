package be.Veltri.POJO;

import java.io.Serializable;
import java.util.*;

public class Configuration implements Serializable{
	private static final long serialVersionUID = 8948096733066571484L;
	private int id;
	private String type;
	private String description;
	private Set<Categorie> listeCategorie = new HashSet<>();
	
	// Constructeurs
	public Configuration(int id, String type, String description) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
	}
	public Configuration () {}
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Categorie> getListeCategorie() {
		return listeCategorie;
	}
	public void setListeCategorie(Set<Categorie> listeCategorie) {
		this.listeCategorie = listeCategorie;
	}	
	public void addCategorie(Categorie categorie){
		listeCategorie.add(categorie);
	}
	public void removeCategorie(Categorie categorie){
		this.listeCategorie.remove(categorie);
	}

	
}
