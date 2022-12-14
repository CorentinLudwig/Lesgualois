package personnages;

import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int effetPotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		Random random = new Random();
		effetPotion = random.nextInt(effetPotionMax);
		if (effetPotion > 7) {
			parler("J'ai préparé une super potion de force " + effetPotion);
		} else if (effetPotion > effetPotionMin) {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + effetPotion);
		} else {
			preparerPotion();
		}
	}

	public void booster(Gaulois gaulois) {
		if(gaulois.getNom()=="Obelix") {
			System.out.println("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else {
			gaulois.boirePotion(effetPotion);
		}
	}
	
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Paronamix", 5, 10);

	}
	
	
}
