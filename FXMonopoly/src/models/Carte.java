package models;

import fenetres.FenetrePrincipale;
import jeu.JoueurMonopoly;
import jeu.PlateauMonopoly;

public abstract class Carte {
	
	private String titre;
	private String description;
	
	public Carte(String titre, String description) {
		this.titre = titre;
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public String getDescription() {
		return description;
	}
	
	
	public abstract void actionCarte(JoueurMonopoly joueur, PlateauMonopoly plateau, FenetrePrincipale fp);

	@Override
	public String toString() {
		return "Carte [titre=" + titre + ", description=" + description + "]";
	}
	
	

}
