package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " '" + texte + "' ");

	}

	private String prendreParole() {
		return "Le gaulois " + nom + " :";
	}

	public void frapper(Romain minus) {
		System.out.println(nom + "envoie un grand coup dans la machoire de" + minus.getNom());
		minus.recevoirCoup((effetPotion*force) / 3);

	}
	

	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est N fois décuplée");
		
		
	}

	 @Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonjour");
		Romain romain = new Romain("César",10);
		asterix.boirePotion(2);
		
		
		
	}
	
}
