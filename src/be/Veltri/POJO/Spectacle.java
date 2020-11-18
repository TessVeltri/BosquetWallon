package be.Veltri.POJO;

import java.io.Serializable;
import java.util.*;

public class Spectacle implements Serializable {
	private static final long serialVersionUID = -9134872159389324444L;
	private int id;
	private String titre;
	private int nbrplacemax;
	private Set<User> listeArtistes = new HashSet<>();
	private Set<Configuration> listConfiguration = new HashSet<>();

	// Constructeurs
	public Spectacle(int id, String titre, int nbrplacemax) {
		this.id = id;
		this.titre = titre;
		this.nbrplacemax = nbrplacemax;
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
	
	public Set<User> getListartistes() {
		return listeArtistes;
	}

	public void setListartistes(Set<User> listartistes) {
		this.listeArtistes = listartistes;
	}

	public Set<Configuration> getListConfiguration() {
		return listConfiguration;
	}

	public void setListConfiguration(Set<Configuration> listConfiguration) {
		this.listConfiguration = listConfiguration;
	}
	
	public void addArtiste(User artiste){
		this.listeArtistes.add(artiste);
	}
	public void removeArtiste(User artiste){
		this.listeArtistes.remove(artiste);
	}

	public void addConfiguration(Configuration configuration){
		this.listConfiguration.add(configuration);
	}
	public void removeConfiguration(Configuration configuration){
		this.listConfiguration.remove(configuration);
	}


}
