package jeu;

import java.util.ArrayList;

import cases.CaseCommunaute;
import cases.Go;
import models.Carte;
import models.Joueur;
import models.Plateau;


public class PlateauMonopoly extends Plateau{
	
	private ArrayList<JoueurMonopoly> joueurs = new ArrayList<JoueurMonopoly>();

	private ArrayList<Carte> chance = new ArrayList<Carte>();
	private ArrayList<Carte> communauté = new ArrayList<Carte>();
	
	public PlateauMonopoly(int nombreDeJoueurs, int nbCases) {
		super(nombreDeJoueurs, 40);
		
		for(int i = 0; i < this.getNbJoueurs(); i++) {
			this.joueurs.add(new JoueurMonopoly("Joueur"+(i+1), i, 1000));
		}
		
//		setCase(0, new Go());
//		setCase(2, new CaseCommunaute());
//		setCase(4, new CaseImpots("Impots sur le revenu", 200));
//		setCase(5, new CaseGare("Gare Montparnasse"));
//		setCase(7, new CaseChance());
//		setCase(10, new CasePrison());
//		setCase(12, new CaseServicePublic("Compagnie d'électricité"));
//		setCase(15, new CaseGare("Gare de Lyon"));
//		setCase(17, new CaseCommunaute());
//		setCase(20, new CaseParcGratuit());
//		setCase(22, new CaseChance());
//		setCase(25, new CaseGare("Gare du Nord"));
//		setCase(28, new CaseServicePublic("Compagnie des eaux"));
//		setCase(30, new CaseAllerPrison());
//		setCase(33, new CaseCommunaute());
//		setCase(35, new CaseGare("Gare Saint-Lazare"));
//		setCase(36, new CaseChance());
//		setCase(38, new CaseImpots("Taxe de Luxe", 100));
	}

	@Override
	public boolean finPartie() {
		return false;
	}

	@Override
	public Joueur estVainqueur() {
		return null;
	}
	
	public void remettreCarteSortiePrisonDansPaquet() {

		boolean carteDansPaquetChance = false;
		for(Carte c:chance) {
			if(c.getDescription().equals("Sortie"))
				carteDansPaquetChance = true;  // TRÈS TRÈS MOCHE, OUI
		}

//		if(carteDansPaquetChance)
//			chance.add(new CarteSortirPrison("Sortie", "Vous êtes libéré de prison. \n(Cette carte doit être conservée)"));
//		else
//			communauté.add(new CarteSortirPrison("Sortie", "Vous êtes libéré de prison. \n(Cette carte doit être conservée)"));
	}
	
	
}
