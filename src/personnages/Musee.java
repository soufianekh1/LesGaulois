package personnages;

public class Musee {
	private final int MaxTrophees=200;
	private Trophee[] trophees = new Trophee[MaxTrophees];
	private int nbTrophee=0;
	
	public void donnerTrophees(Gaulois gaulois,Trophee trophee) {
		
		trophees[nbTrophee]=trophee;
		nbTrophee+=1;
		
	}
	
	public String extraireInstructionsOCaml() {
		String texte;
		texte="let musee= [ ";
		for(int i=0;i<nbTrophee;i++) {
			texte+=trophees[i].donnerNom()+", "+trophees[i].getEquipement()+"; \n";
		}
		texte+= "]";
		return texte;
	}
	
	

}
