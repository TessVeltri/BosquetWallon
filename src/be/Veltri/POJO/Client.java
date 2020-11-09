package be.Veltri.POJO;

import java.io.Serializable;

public class Client extends User implements Serializable{
	private static final long serialVersionUID = 1411557677294977778L;
	
	public Client(String nom, String prenom, String rue, int num, int cp, String ville, String email,
			String password) {
		super(nom, prenom, rue, num, cp, ville, email, password);
	}

}
