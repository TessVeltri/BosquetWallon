package be.Veltri.POJO;

import java.io.Serializable;

public class Gestionnaire extends User implements Serializable{
	private static final long serialVersionUID = 7024694604515894819L;

	public Gestionnaire(int id, String nom, String prenom, String rue, int num, int cp, String ville, String email,
			String password, String discriminator) {
		super(id, nom, prenom, rue, num, cp, ville, email, password, discriminator);
	}

}
