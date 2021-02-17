package Sortirdeprison;

import models.Partie;

public class DetDesDouble implements SortirDePrison {
	public Partie partie=Partie.getInstance();
	@Override
	public int sotrirStrategy() {
		// TODO Auto-generated method stub
		if(partie.getListe().get(0).agrent > 100 ) {
			partie.getListe().get(0).setAgrent(partie.getListe().get(0).getAgrent()-1);
			System.out.println("let's get the f*** out of here");
		}else {
			System.out.println("sorry you have not enaugh money  you will still at the GAIL ( -_- )");
			System.out.println("enjoooy!!!");
		}
		return 0;
	}

	@Override
	public int sotrirStrategy(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}