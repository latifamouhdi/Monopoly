package models;

import java.util.ArrayList;

public class Partie {
	
	private Des de;
	private Board board;
	private Banque banque;
	private Pion pion;
	private int nombreJoueurs;
	
	public static ArrayList<Joueur> liste=new ArrayList<Joueur>();
	
	public static ArrayList<Joueur> getListe() {
		return liste;
	}

	
	public static void setJoueur(Joueur joueur) {
//		Partie.liste = liste;
		liste.add(joueur);
	}

	public Partie() {
		
	}

	public int getNombreJoueurs() {
		return nombreJoueurs;
	}

	public void setNombreJoueurs(int nombreJoueurs) {
		this.nombreJoueurs = nombreJoueurs;
	}


	
	
	

	
}
