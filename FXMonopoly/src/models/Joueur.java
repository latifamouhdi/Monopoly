package models;


public class Joueur {
	public Boolean estEnPrison;
	public static int agrent;
	public static String nom;
	public static Pion pion;
	public static int x,y;
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public Joueur(String nom, Pion pion) {
		this.nom = nom;
		this.pion=pion;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAgrent() {
		return agrent;
	}

	public void setAgrent(int agrents) {
		this.agrent = agrents;
	}

	public String toString() {
		return "Joueur [agrent=" + agrent + ", nom=" + nom + ", pion=" + pion + "]";
	}

	public Boolean getEstEnPrison() {
		return estEnPrison;
	}

	public void setEstEnPrison(Boolean estEnPrison) {
		this.estEnPrison = estEnPrison;
	}
	
	
	
	
}
