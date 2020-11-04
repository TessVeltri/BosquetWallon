package be.Veltri.POJO;

public class Disponibilite {
	private Representation representation;
	private Categorie categorie;
	private int nbrplacerestantes;
	
	// Constructeur
	public Disponibilite(Representation representation, Categorie categorie, int nbrplacerestantes) {
		this.representation = representation;
		this.categorie = categorie;
		this.nbrplacerestantes = nbrplacerestantes;
	}
	public Disponibilite () {}
	
	// Accesseurs
	public Representation getRepresentation() {
		return representation;
	}
	public void setRepresentation(Representation representation) {
		this.representation = representation;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getNbrplacerestantes() {
		return nbrplacerestantes;
	}
	public void setNbrplacerestantes(int nbrplacerestantes) {
		this.nbrplacerestantes = nbrplacerestantes;
	}
	
	
	
}
