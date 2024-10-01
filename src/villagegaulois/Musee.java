package villagegaulois;

import personnages.*;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees = 0;
	
	public void donnerTrophees(Gaulois gaulois) {
		Equipement[] transfert = gaulois.getTrophees();
		if (nbTrophees==200) {
			System.out.println("Le musée est plein");
		} else {
			for (int i = 0; i<gaulois.getNbTrophees();nbTrophees++, i++) {
				trophees[nbTrophees] == transfert[i];
			}
		}
	}
}
