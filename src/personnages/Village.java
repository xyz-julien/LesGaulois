package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois > villageois.length) {
			System.out.println("Village plein !");
		} else {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
		
	}
	
	public Gaulois trouverHabitant(int ref) {
		//if (ref<=0 || ref>nbVillageois) {
		//	System.out.println("Réference non existante !");
		//} else {
			return villageois[ref] ;	
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le " + getNom() + " du chef " + getChef() + " vivent les légendaires gaulois :");
		for (int i = 0; i<nbVillageois;i++) {
			System.out.println("-" + villageois[i]);
		}
	}
	
	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// e) le tableau à une taille de 0 à 29 l'emplacement 30 est donc inutilisable.
		Chef abararacourcix = new Chef("Abararacourcix",6,village);
		village.setChef(abararacourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//e) asterix est assigné à villageois[0], villageois[1] est donc vide ce qui explique le null
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
}
