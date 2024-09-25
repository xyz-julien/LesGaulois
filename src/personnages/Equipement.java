package personnages;

public enum Equipement {
	CASQUE("casque"),BOUCLIER("bouclier");
	
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public int donnerNumero(Equipement equipement) {
		int numero = 0;
		switch(equipement) {
			case CASQUE :
				numero = 1;
				break;
			default :
				numero = 2;
		}
		return numero;
	}
	
	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {
		System.out.println("Les équipements sont :");
		for (Equipement equipement : Equipement.values()) {
			System.out.println("-" + equipement);
		}
	}
}
