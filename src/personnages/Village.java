package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbvillageois = 0;
	private int nbVillageoisMaximum;
	private Gaulois villageois[] = new Gaulois[nbVillageoisMaximum];

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouteHabitant(Gaulois gaulois) {
		if (nbvillageois < nbVillageoisMaximum) {
			villageois[nbvillageois] = gaulois;
		}
		nbvillageois++;

	}
	
	public Gaulois trouvervillageois(int nvillageois) {
		return villageois[nvillageois];
	}

}
