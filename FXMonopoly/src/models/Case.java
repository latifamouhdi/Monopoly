package models;

public abstract class Case {

	private String nom;
	private int id = 0;
	private int valeur = 0;
	
	public Case(String nom, int valeur) {
		this.nom = nom;
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public abstract String getCouleur();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
