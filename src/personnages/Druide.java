package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println("Bonjour , je suis le druide " + nom + " et ma potion peut aller  d'une force " + effetPotionMin + " à " + effetPotionMax + ".");

	}

	private String prendreParole() {
		return "Le druide " + nom + " :";
	}
	private int forcePotion=1;
	public int preparerPotion() {
		Random random= new Random();
		forcePotion=random.nextInt(effetPotionMax);
		while(forcePotion<effetPotionMin)
		{
			forcePotion=random.nextInt(effetPotionMax);
		}
		
		if(forcePotion>7) {
			System.out.println("J'ai préparé un super potion de force");
		}
		else {
			
			System.out.println("Je n'ai pas trouvé tous les ingrédiants, ma potion est seulement de force "+ forcePotion);
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois) {
		
		if( gaulois.getNom().equals("Obélix"))
		{
			System.out.println("Non, Obélix !... Tu n'auras pas de potion magique !");
		}
		else
		{
			gaulois.boirePotion(forcePotion);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Druide panoramix= new Druide("Panoramix",5,10);
		panoramix.parler(null);
		panoramix.preparerPotion();
		System.out.println("Je vais aller préparer une petite potion");
		panoramix.preparerPotion();
		Gaulois obelix= new Gaulois("Obélix",5);
		panoramix.booster(obelix);
		obelix.parler("Par Bénélos , ce n'est pas juste");
		Gaulois asterix= new Gaulois("Asterix",5);
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus= new Romain("Minus",5);
		asterix.parler("UN GAU ... UN GAUGAU...");
		asterix.frapper(minus);
		
		
	}

}
