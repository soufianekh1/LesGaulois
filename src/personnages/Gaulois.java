package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int force1;
	int nbTrophees=0;
	Equipement[] trophees = new Equipement[100];

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

//	private String prendreParole() {
//		return "Le gaulois " + nom + " :";
//		 
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
		}
	public int getForce() {
		return force;
	}

//	public void frapper(Romain minus) {
//		System.out.println(nom + "envoie un grand coup dans la machoire de" + minus.getNom());
//		minus.recevoirCoup((effetPotion*force) / 3);
//
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
		this.trophees[nbTrophees] = trophees[i];
		
		}
		
		}

	

	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est N fois décuplée");
		
		
	}
	
	
//	private String prendreParole() {
//		String texte = "Le gaulois " + nom + " : ";
//		return texte;
//		}
	
	
	public void faireUneDonation(Musee musee) {
		
		if(nbTrophees>0) {
			parler("Je donne au musee tous mes trophees \n" );
			for(int i=0;i<nbTrophees;i++)
			{
				parler("-"+trophees[i]+ "\n");
			}
		}
		
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
