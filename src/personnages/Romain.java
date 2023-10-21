package personnages;

public class Romain {
	private String nom;
	private int force;
	public boolean vainqueur=true;
	Equipement[] equipements = new Equipement[2];
	int nbEquipements = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0;

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

//	public void recevoirCoup(int forceCoup) {
//		
//		assert force>0;
//		int avantForce=force;
//		force-= forceCoup;
//		assert force>avantForce;
//		if(force>0) {
//			System.out.println("Aiie !");
//			
//		}
//		else {
//			System.out.println("J'abandonne...");
//		}
//			
//		
//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);

		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			vainqueur=false;
			
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	public int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipements != 0) {
			texte += "\n Mais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipements;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}

			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup += resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipements];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");

		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipements; i++) {
			while (equipements[i] != null) {

				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipements) {

		case 2:
			System.out.println("Le soldat " + getNom() + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + getNom() + " possède déjà un casque !");
				break;
			} else {

				mettreEquipement(1, equipement);
				break;
			}
		case 0:
			mettreEquipement(0, equipement);
			break;
		}

	}

	private void mettreEquipement(int indice, Equipement equipement) {
		equipements[indice] = equipement;
		System.out.println("Le soldat " + getNom() + " s’équipe avec un " + equipement);
		nbEquipements += 1;
	}

	public static void main(String[] args) {

		Romain minus = new Romain("Minus", 6);
		Equipement equipe = Equipement.CASQUE;
		Equipement equipe1 = Equipement.BOUCLIER;
		System.out.println(equipe);
		minus.sEquiper(equipe);
		minus.sEquiper(equipe);
		minus.sEquiper(equipe1);
		minus.sEquiper(equipe1);

	}

}
