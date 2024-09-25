package personnages;

import java.util.Random;

public class Druide {
	private static final int FORCE_MOYENNE = 7;
	
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
				+ effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " » " );
	}

	private String prendreParole() {
		return "Le druide " + nom + " :";
	}
	
	//3
	public void preparerPotion() {
		forcePotion = random.nextInt(effetPotionMax + 1 - effetPotionMin)+ effetPotionMin;
		if (forcePotion > FORCE_MOYENNE) {
			parler("J'ai préparé une super potion de force de force " + forcePotion);
		} else {
			parler("Je n'ai pas trouvé les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		
	}
	
	//5
	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
			gaulois.parler("Par Bélanos, ce n'est pas juste !");
		} else if (forcePotion == 1 ) {
			preparerPotion();
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
