package models;

/**
 * Définit le joueur
*@author Latifa Mouhdi
*/

public class Joueur {
	
	private String nom;
	private String pion;
	private String cl;
	
	

	public Joueur(String nom, String pion, String cl) {

		this.nom = nom;
		this.pion = pion;
		this.cl = cl;
	}
	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	private int id;
	private int position = 0;
	public Joueur(String nom, int id) {
		this.nom = nom;
		this.id = id;
		
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", id=" + id + ", position=" + position + "]";
	}
	
	
}
