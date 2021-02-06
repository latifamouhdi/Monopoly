package jeu;

import java.util.ArrayList;

import models.Case;
import models.Joueur;

public class JoueurMonopoly extends Joueur{
	
	private int argent = 1000;
	private boolean enfaillite = false;
	private boolean estPrison = false;
	private int toursEnPrison = 1;
	private boolean possedeCarteSortiePrison = false;
	private ArrayList<Case> terrains = new ArrayList<Case>();
	private ArrayList<String> couleurs = new ArrayList<String>();

	public JoueurMonopoly(String nom, int id,int argent) {
		super(nom, id);
		this.argent=argent;
	}

	public int getToursEnPrison() {
		return toursEnPrison;
	}

	public void setToursEnPrison(int toursEnPrison) {
		this.toursEnPrison = toursEnPrison;
	}

	public boolean isEstPrison() {
		return estPrison;
	}

	public void setEstPrison(boolean estPrison) {
		this.estPrison = estPrison;
	}

	public boolean isPossedeCarteSortiePrison() {
		return possedeCarteSortiePrison;
	}

	public void setPossedeCarteSortiePrison(boolean possedeCarteSortiePrison) {
		this.possedeCarteSortiePrison = possedeCarteSortiePrison;
	}

	public void ajouterTerrain(Case terrain) {
		this.terrains.add(terrain);
	}
	
	public String getListeStringTerrains() {
		String s = "";
		for(Case t:this.terrains) {
			s+=(t.getNom()+",");
		}
		return s;
	}
	
	public ArrayList<Case> getListeTerrains(){
		return this.terrains;
	}
	
	public ArrayList<String> getListeCouleur(){

		couleurs.clear();

		int 	brun = 0,
				turquoise = 0,
				mauve = 0,
				orange = 0,
				rouge = 0,
				jaune = 0,
				vert = 0,
				bleu = 0;

		for(Case t:this.getListeTerrains()) {

			if(t.getCouleur() == "brun")
				brun += 1;
			if(t.getCouleur() == "turquoise")
				turquoise += 1;
			if(t.getCouleur() == "mauve")
				mauve += 1;
			if(t.getCouleur() == "orange")
				orange += 1;
			if(t.getCouleur() == "rouge")
				rouge += 1;
			if(t.getCouleur() == "jaune")
				jaune += 1;
			if(t.getCouleur() == "vert")
				vert += 1;
			if(t.getCouleur() == "bleu")
				bleu += 1;
		}

		if(brun == 2) 		couleurs.add("brun");

		if(turquoise == 3) 	couleurs.add("turquoise");

		if(mauve == 3) 		couleurs.add("mauve");

		if(orange == 3) 	couleurs.add("orange");

		if(rouge == 3) 		couleurs.add("rouge");

		if(jaune == 3) 		couleurs.add("jaune");

		if(vert == 3) 		couleurs.add("vert");

		if(bleu == 2) 		couleurs.add("bleu");

		return this.couleurs;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
	
	public void retirerArgent(int montant) {
		this.argent = this.argent - montant;
		if(this.argent <= 0) {
			this.argent = 0;
			this.setEnfaillite(true);
		}
	}

	public boolean isEnfaillite() {
		return enfaillite;
	}

	public void setEnfaillite(boolean enfaillite) {
		this.enfaillite = enfaillite;
		//clearMarqueurs();
		this.terrains.clear();
	}

	@Override
	public String toString() {
		return "JoueurMonopoly [argent=" + argent + ", enfaillite=" + enfaillite + ", estPrison=" + estPrison
				+ ", toursEnPrison=" + toursEnPrison + ", possedeCarteSortiePrison=" + possedeCarteSortiePrison
				+ ", terrains=" + terrains + ", couleurs=" + couleurs + "]";
	}
	
	
	
}
