package Sortirdeprison;

import Controllers.BoardController;
import models.Partie;

public class DetDesDouble implements SortirDePrison {
	public Partie partie=Partie.getInstance();
	public int x1 ,y1;
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	@Override
	public int sotrirStrategy() {
		if(BoardController.des1==BoardController.des2 ) {
			System.out.println("you are lucky ");
			partie.getListe().get(BoardController.tour).setEstEnPrison(false);
			return 1;
		}else {
			System.out.println("not today");
			return 0;
		}
	
	}

	@Override
	public boolean sotrirStrategy(int x, int y) {
		return false;
		// TODO Auto-generated method stub
	
		
	}

}