package histoire;

import personnages.Gaulois;
import personnages.Romain;




public class Scenario {
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6);
		asterix.parler("Bonjour , les amis ");
		minus.parler("UN GAU.. UN GAUGAU...");
		for(int i=0;i<=2;i++)
		{
			asterix.frapper(minus);
			
		}
		

	}

}
