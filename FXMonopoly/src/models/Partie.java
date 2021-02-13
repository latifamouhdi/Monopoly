package models;

import java.util.ArrayList;


public class Partie {
	
	private Joueur joueur;
	private Des de;
	private Board board;
	private Banque banque;
	private Pion pion;
	public Partie(Joueur joueur, Des de, Board board, Banque banque, Pion pion) {
		
		this.joueur = joueur;
		this.de = de;
		this.board = board;
		this.banque = banque;
		this.pion = pion;
	}
	
	

	
}
