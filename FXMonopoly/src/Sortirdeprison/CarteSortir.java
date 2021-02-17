package Sortirdeprison;

import models.Partie;

public class  CarteSortir implements SortirDePrison {
	public Partie partie=Partie.getInstance();
	@Override
	public int sotrirStrategy() {
		// TODO Auto-generated method stub
		if(partie.getListe().get(0).carteprison > 0 ) {
			partie.getListe().get(0).setCarteprison(partie.getListe().get(0).getCarteprison()-1);
			System.out.println("freeedoom wwaaw");
		}else {
			System.out.println("sorry no carte has been found you will still at the GAIL ( -_- )");
		}
		return 0;
	}

	@Override
	public int sotrirStrategy(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}




}
