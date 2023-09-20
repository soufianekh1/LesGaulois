package personnages;

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

}
