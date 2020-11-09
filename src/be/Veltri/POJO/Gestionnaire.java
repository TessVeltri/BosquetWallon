package be.Veltri.POJO;

import java.io.Serializable;

public class Gestionnaire extends User implements Serializable{
	private static final long serialVersionUID = 7024694604515894819L;

	public Gestionnaire(String nom, String prenom, String rue, int num, int cp, String ville, String email,
			String password) {
		super(nom, prenom, rue, num, cp, ville, email, password);
	}

}
