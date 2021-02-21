package Sortirdeprison;

import Controllers.BoardController;
import models.Partie;

public class Payemnts implements SortirDePrison {
	public Partie partie=Partie.getInstance();
	@Override
	public int sotrirStrategy() {
		// TODO Auto-generated method stub
		if(partie.getListe().get(BoardController.tour).agrent > 1000 ) {
			partie.getListe().get(BoardController.tour).setAgrent(partie.getListe().get(BoardController.tour).getAgrent()-1000);
			System.out.println("freeedoom wwaaw");
			System.out.println("you have payed 1000$  ");
			System.out.println("votre solde actuelle  est :   "+partie.getListe().get(BoardController.tour).getAgrent());
			partie.getListe().get(BoardController.tour).setEstEnPrison(false);
		}else {
			System.out.println("sorry you have not enaugh money  you will still at the GAIL ( -_- )");
			System.out.println("enjoooy!!!");
		}
		return 0;
	}
	@Override
	public boolean sotrirStrategy(int x, int y) {
		// TODO Auto-generated method stub
		
		return false;
	}

	

}
