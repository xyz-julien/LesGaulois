package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
