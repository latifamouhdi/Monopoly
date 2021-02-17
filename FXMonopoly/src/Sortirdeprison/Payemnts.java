package Sortirdeprison;

import models.Partie;

public class Payemnts implements SortirDePrison {
	public Partie partie=Partie.getInstance();
	@Override
	public int sotrirStrategy() {
		// TODO Auto-generated method stub
		if(partie.getListe().get(0).agrent > 1000 ) {
			partie.getListe().get(0).setAgrent(partie.getListe().get(0).getAgrent()-1000);
			System.out.println("freeedoom wwaaw");
			System.out.println("you have payed 1000$  ");
			System.out.println("votre solde actuelle  est :   "+partie.getListe().get(0).getAgrent());
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
