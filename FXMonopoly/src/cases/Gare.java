package cases;


public class Gare extends Propriete{
	
	public static int[][] position =
	{
	{ 0, 5 } ,
	{ 5, 0 } ,
	{ 5, 10 } ,
	{ 10, 5 } ,
	};
	
	public Gare(int prix) {
		super(prix);
		
		
	}

	
	 public void afficher() {
		 
		 for (int i = 0; i < position .length; ++i) {
			 for(int j = 0; j < position [i].length; ++j) {
				 System.out.print(position [i][j]);
			 }
			 System.out.println();
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


	public static int[][] getPosition() {
		return position;
	}

	

	
	
	

}
