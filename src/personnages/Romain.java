package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	private int forceEquipement = 0;
	
	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
	    System.out.println(prendreParole() + "� " + texte + " �");	 
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int forceSur = force;
		assert force >= 0;
		force -= forceCoup;
		assert force<forceSur;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	
	private int calculerForceEquipement() {
		if (forceEquipement == 0) {
			return 0;
		} else {
			for (int i = 0; i<nbEquipement; i++) {
				forceEquipement += Equipement.donnerNumero(equipements[i]);
			}
		} 	
	}
	
	public void sEquiper(Equipement equipement) {
		calculerForceEquipement();
		if (forceEquipement == 3) {
			System.out.println("Le soldat " + getNom() + " est d�j� bien prot�g� !" );
		} else if (forceEquipement == 2 && Equipement.donnerNumero(equipement) == 2) {
			System.out.println("Le soldat " + getNom() + " poss�de d�j� un bouclier.");
			} else if (forceEquipement == 1 && Equipement.donnerNumero(equipement) == 1) {
				System.out.println("Le soldat " + getNom() + " poss�de d�j� un casque.");
				} else {
					equipements[nbEquipement] = equipement;
					nbEquipement++;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus.prendreParole());
		minus.parler("a");
		minus.recevoirCoup(1);
	}
}
