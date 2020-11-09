package be.Veltri.POJO;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 7609602111830625L;
	private String nom;
	private String prenom;
	private String rue;
	private int num;
	private int cp;
	private String ville;
	private String email;
	private String password;
	private String discriminator;

	// Constructeurs
	public User(String nom, String prenom, String rue, int num, int cp, String ville, String email,
			String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.num = num;
		this.cp = cp;
		this.ville = ville;
		this.email = email;
		this.password = password;
	}

	public User() {
	}

	// Accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

}