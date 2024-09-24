package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte+ " » ");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup de mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}
	
	@Override
	public String toString() {
		return nom;
	}
	// 4
	public void boirePotion(int force) {
		this.effetPotion = force;
		parler("Merci Druide, je sens que ma force est " + force + " fois décuplée.");
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println("Le gaulois " + asterix.getNom() + " vient d'être créé.");
		Romain minus = new Romain("Minus", 6);
		asterix.boirePotion(3);
		asterix.frapper(minus);
	}		
}
