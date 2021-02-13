package models;


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
	

	
	

}
