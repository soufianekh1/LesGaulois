package personnages;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements = new Equipement[2];
	int nbEquipements=0;
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force>0;
		
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
		
		assert force>0;
		int avantForce=force;
		force-= forceCoup;
		assert force>avantForce;
		if(force>0) {
			System.out.println("Aiie !");
			
		}
		else {
			System.out.println("J'abandonne...");
		}
			
		
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipements) {
		
		
		
		case 2:
			System.out.println("Le soldat "+getNom()+ " est déjà bien protégé !");
			break;
		case 1:
			if(equipements[0] == equipement) {
				System.out.println("Le soldat "+getNom()+" possède déjà un casque !");
				break;
			}
			else 
			{
				equipements[1]=equipement;
				System.out.println("Le soldat "+getNom()+" s’équipe avec un bouclier.");
				nbEquipements+=1;
				break;
			}
		case 0:
			equipements[0]=equipement;
			System.out.println("Le soldat "+getNom()+" s’équipe avec un bouclier.");
			nbEquipements+=1;
			break;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Romain minus = new Romain("Minus",6);
		Equipement equipe = Equipement.CASQUE;
		Equipement equipe1 = Equipement.BOUCLIER;	
		System.out.println(equipe);
		minus.sEquiper(equipe);
		minus.sEquiper(equipe);
		minus.sEquiper(equipe1);
		minus.sEquiper(equipe1);
		
		
		
	}

}
