package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " '" + texte + "' ");
		
	}

	private String prendreParole() {
		return "Le romain " + nom + " :";
	}
	
	public void recevoirCoup(int forceCoup) {
		force-= forceCoup;
		if(force>0) {
			System.out.println("Aiie !");
			
		}
		else {
			System.out.println("J'abandonne...");
		}
			
		
	}

}
