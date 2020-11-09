package be.Veltri.POJO;

import java.io.Serializable;

public class Artistes extends User implements Serializable{
	private static final long serialVersionUID = 3392480489469864489L;

	public Artistes(String nom, String prenom, String rue, int num, int cp, String ville, String email,
			String password) {
		super(nom, prenom, rue, num, cp, ville, email, password);
	}

}
