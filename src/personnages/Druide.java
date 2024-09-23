package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private Random random = new Random();
	//5
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

	public void parler(String texte) {
		System.out.println(prendreParole() + " � " + texte + " � " );
	}

	private String prendreParole() {
		return "Le druide " + nom + " :";
	}
	
	//3
	public int preparerPotion() {
		int hasard = random.nextInt(effetPotionMax + 1 - effetPotionMin)+ effetPotionMin;
		if (hasard > 7) {
			parler("J'ai pr�par� une super potion de force de force " + hasard);
		} else {
			parler("Je n'ai pas trouv� les ingr�dients, ma potion est seulement de force " + hasard);
		}
		
		return forcePotion = hasard;
	}
	
	//5
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Ob�lix") {
			parler("Non, Ob�lix !... Tu n'auras pas de potion magique !");
			gaulois.parler("Par B�lanos, ce n'est pas juste !");
		} else if (forcePotion == 1 ) {
			forcePotion = preparerPotion();
			gaulois.boirePotion(forcePotion);
			} else {
				gaulois.boirePotion(forcePotion);
			}
		}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
}
