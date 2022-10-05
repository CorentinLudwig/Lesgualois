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
			nbvillageois++;
		}

	}

	public Gaulois trouverHabitant(int nvillageois) {
		return villageois[nvillageois];
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
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);

	}
}
