package villagegaulois;

import personnages.*;

public class Trophee {
	private Gaulois gaulois;
	private Equipement[] equipement;
	
	public Trophee(Gaulois gaulois, Equipement[] equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
	
	public Gaulois getGaulois() {
		return gaulois;
	}
	
	public Equipement[] getEquipement() {
		return equipement;
	}
	
	public String donnerNom(Gaulois gaulois) {
		return gaulois.getNom();
	}
	
}

