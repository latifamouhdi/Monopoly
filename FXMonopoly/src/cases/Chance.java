package cases;

import models.Carte;
import models.Case;

public class Chance extends Case{
	Carte carte;
	
	public static int[][] position =
		{
		{ 3, 10 } ,
		{ 2, 0 } ,
		{ 10, 6 } ,
		};

	@Override
	public String description() {
		return "Chance";
	}


}
