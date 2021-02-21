package models;

import javafx.scene.image.ImageView;

public class Couleur {
	public int x,y;
	public String image;
	public boolean vendu ;   
	
	 public boolean isVendu() {
		return vendu;
	}


	public void setVendu(boolean vendu) {
		this.vendu = vendu;
	}


	public String coleur;


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}




	public Couleur(int x, int y,String couleur,String image ,boolean vendu ) {
		this.x=x;
		this.y=y;
		this.vendu=vendu;		
		this.coleur=couleur;
		this.image = image;

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
