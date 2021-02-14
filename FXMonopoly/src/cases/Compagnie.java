package cases;

public class Compagnie extends Propriete{

	public static int[][] position =
		{
		{ 8, 0 } ,
		{ 0, 8 } ,
		};
	
	public Compagnie(int prix) {
		super(prix);
	}
	
	@Override
	public String description() {
		return "Compagnie";
	}


}
