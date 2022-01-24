package cases;

import models.Carte;
import models.Case;

public class CaisseCommunaute extends Case{

	public static int[][] position =
		{
		{ 0, 3 } ,
		{ 8, 10 } ,
		{ 10, 3 } ,
		};
	Carte carte;

	@Override
	public String description() {
		return "CaisseCommunaute";
	}

}
