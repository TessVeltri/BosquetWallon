package be.Veltri.POJO;

import java.io.Serializable;

public class Categorie implements Serializable{
	private static final long serialVersionUID = 461917675324325531L;
	private int id;
	private String type;
	private float pri;
	private int nbrmaxplace;
	private Configuration configuration;
	
	// Constructeurs
	public Categorie(int id, String type, float pri, int nbrmaxplace, Configuration configuration) {
		this.id = id;
		this.type = type;
		this.pri = pri;
		this.nbrmaxplace = nbrmaxplace;
		this.configuration = configuration;
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
	public float getPri() {
		return pri;
	}
	public void setPri(float pri) {
		this.pri = pri;
	}
	public int getNbrmaxplace() {
		return nbrmaxplace;
	}
	public void setNbrmaxplace(int nbrmaxplace) {
		this.nbrmaxplace = nbrmaxplace;
	}
	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	
	
	
}
