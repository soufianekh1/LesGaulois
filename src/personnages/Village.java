package personnages;

public class Village {
	private String nom;
	private Chef chef;
	Gaulois[] villageois;
	int nbVillageois=0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		
		this.chef=chef;
	}
	
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	
	}
	
	public Gaulois trouverHabitant(int numeroGaulois) {
		return villageois[numeroGaulois];
			
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le vilage du "+chef.getNom()+" vivent les légendaires gaulois :");
		for(int i=0;i<nbVillageois;i++)
		{
			System.out.println(villageois[i].getNom());
		}
		
	}
	
	public static void main(String[] args) {
		
		Village village= new Village("Village des Irréductibles",30);
		//Gaulois gaulois=village.trouverHabitant(30);
		// on obtient l'Exception car il nexiste pas de villageois de numéro 30 car le tableau village contient 30 case mais du numéro 0 au numéro 29
		
		Chef abraracourcix=new Chef("Abraracourcix",6 ,village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Astérix",8);
		
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// on a eu comme résultat null parce que le tableau villageois est vide
		
		Gaulois obelix = new Gaulois("Obélix",25);

		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	
	}
	

}
