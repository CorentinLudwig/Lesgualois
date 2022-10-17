package personnages;

public class Romain {
	private String nom;
	private int force;
	private String texte;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force > 0) {
//			parler("A�e");
//		} else {
//			parler("J'abandonne...");
//		}
//	}

//	public Equipement[] recevoirCoup(int forceCoup) {
//		Equipement[] equipementEjecte = null;
//		// pr�condition
//		assert force > 0;
//		int oldForce = force;
//		forceCoup = CalculResistanceEquipement(forceCoup);
//		force -= forceCoup;
//		// if (force > 0) {
//		// parler("A�e");
//		// } else {
//		// equipementEjecte = ejecterEquipement();
//		// parler("J'abandonne...");
//		// }
//		switch (force) {
//		case 0:
//		parler("A�e");
//		}
//	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			this.equipement[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + nom + " s��quipe avec un " + equipement);
			break;

		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("Le soldat " + nom + " poss�de d�j� un " + equipement + "!");
			} else {
				this.equipement[nbEquipement] = equipement;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s��quipe avec un " + equipement);
			}
			break;
		case 2:
			System.out.println("Le soldat " + nom + " est d�j� bien prot�g� !");
			break;
		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);

		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
