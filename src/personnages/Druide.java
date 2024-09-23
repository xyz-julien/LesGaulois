package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force "
				+ effetPotionMin + " � " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}

	private void parler(String texte) {
		System.out.println(prendreParole() + " � " + texte + " � " );
	}

	private String prendreParole() {
		return "Le druide " + nom + " :";
	}
	
	//3
	public void preparerPotion() {
		Random random = new Random();
		int hasard = random.nextInt(effetPotionMax + 1 - effetPotionMin)+ effetPotionMin;
		if (hasard > 7) {
			parler("J'ai pr�par� une super potion de force de force " + hasard);
		} else {
			parler("Je n'ai pas trouv� les ingr�dients, ma potion est seulement de force " + hasard);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
}
