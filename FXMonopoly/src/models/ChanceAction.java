package models;

import cases.Chance;

public class ChanceAction {
	
	Chance chance;
	
	Joueur joueur;
	public void move(Joueur joueur, int idCarte) {
		
		if(joueur.getX()<=7 && joueur.getY()==10) {
			joueur.setX(joueur.getX()+3);
			
		}
	}

}
