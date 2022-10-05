package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbvillageois = 0;

	private Gaulois villageois[];

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouteHabitant(Gaulois gaulois) {
		villageois[nbvillageois] = gaulois;
		nbvillageois++;

	}

	public Gaulois trouverHabitant(int nvillageois) {
		return villageois[nvillageois];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef.getNom() + "vivent les legendaires gaulois:");
		for (int i = 0; i < nbvillageois; i++) {
			System.out.println("-" + villageois[i].getNom());
		}

	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
//		at personnages.Village.trouverHabitant(Village.java:32)
//		at personnages.Village.main(Village.java:37)
//		Un tableau de 30 entre vas de 0 a 29
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouteHabitant(Asterix);
		Gaulois Obelix = new Gaulois("Obelix", 25);
		village.ajouteHabitant(Obelix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		null
//		Le tableau est vide en 1
		village.afficherVillageois();

	}
}
