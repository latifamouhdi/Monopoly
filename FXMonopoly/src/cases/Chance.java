package cases;

import models.Case;

public class Chance extends Case{

	public Chance(String nom, int valeur) {
		super(nom, valeur);
	}

	@Override
	public String getCouleur() {
		return null;
	}

}
