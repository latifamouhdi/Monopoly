package cases;

import java.util.Map;

public class Gare extends Propriete{

	public Gare(int prix) {
		super(prix);
		
		position.put(0, 5);
		position.put(5, 0);
		position.put(5, 10);
		position.put(10, 5);
	}

	
	 public void afficher() {
		for (Map.Entry position : position.entrySet()) {
	           System.out.println("clé: "+position.getKey() 
	                              + " | valeur: " + position.getValue());
	        }

	}


	@Override
	public String description() {
		return "Gare";
	}


	@Override
	public String toString() {
		return "Gare [prix=" + prix + ", sealable=" + sealable + ", position=" + position + ", description()="
				+ description() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

	
	
	

}
