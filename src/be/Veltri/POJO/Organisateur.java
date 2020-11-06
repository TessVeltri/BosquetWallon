package be.Veltri.POJO;

import java.io.Serializable;

public class Organisateur extends User implements Serializable{
	private static final long serialVersionUID = -74720374941212014L;
	
	public Organisateur(int id, String nom, String prenom, String rue, int num, int cp, String ville, String email,
			String password, String discriminator) {
		super(id, nom, prenom, rue, num, cp, ville, email, password, discriminator);
	}

	
}
