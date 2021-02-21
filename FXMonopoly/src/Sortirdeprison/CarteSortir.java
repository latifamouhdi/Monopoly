package Sortirdeprison;

import Controllers.BoardController;
import models.Partie;

public class  CarteSortir implements SortirDePrison {
	public Partie partie=Partie.getInstance();
	@Override
	public int sotrirStrategy() {
		// TODO Auto-generated method stub
		if(partie.getListe().get(BoardController.tour).carteprison > 0 ) {
			partie.getListe().get(BoardController.tour).setCarteprison(partie.getListe().get(BoardController.tour).getCarteprison()-1);
			System.out.println("freeedoom wwaaw");
			System.out.println("you still have "+partie.getListe().get(BoardController.tour).getCarteprison()+" card");
			partie.getListe().get(BoardController.tour).setEstEnPrison(false);
		}else {
			System.out.println("sorry no carte has been found you will still at the GAIL ( -_- )");
		}
		return 0;
	}

	@Override
	public boolean sotrirStrategy(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}




}