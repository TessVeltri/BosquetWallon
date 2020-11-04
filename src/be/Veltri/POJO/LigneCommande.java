package be.Veltri.POJO;

public class LigneCommande {
	private Commande commande;
	private Place place;
	
	public LigneCommande(Commande commande, Place place) {
		this.commande = commande;
		this.place = place;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
	
}
