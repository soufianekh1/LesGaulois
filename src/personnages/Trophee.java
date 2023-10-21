package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	
	public Trophee(Gaulois gaulois,Equipement equipement) {
		
		this.gaulois=gaulois;
		this.equipement=equipement;
		
	}
	
	public String donnerNom() {
		return gaulois.getNom();
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
}
