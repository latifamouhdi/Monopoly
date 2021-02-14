package models;

public class Couleur {
	int x,y;
	
	String coleur;

	public Couleur(int x, int y,String couleur) {
		this.x=x;
		this.y=y;
		this.coleur=couleur;
		
	}

	
	public String getColeur() {
		return coleur;
	}

	

	public void setColeur(String coleur) {
		this.coleur = coleur;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	

}
