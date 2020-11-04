package be.Veltri.POJO;

import java.io.Serializable;

public class Configuration implements Serializable{
	private static final long serialVersionUID = 8948096733066571484L;
	private int id;
	private String type;
	private String description;
	private Spectacle spectacle;
	
	// Constructeurs
	public Configuration(int id, String type, String description, Spectacle spectacle) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.spectacle = spectacle;
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
	public Spectacle getSpectacle() {
		return spectacle;
	}
	public void setSpectacle(Spectacle spectacle) {
		this.spectacle = spectacle;
	}
	
	
	
}
