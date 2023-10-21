package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour , les amis ");
		minus.parler("UN GAU.. UN GAUGAU...");
		do {
			asterix.frapper(minus);

		} while (minus.getForce() > 0);

	}

}
