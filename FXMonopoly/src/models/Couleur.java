package models;

import javafx.scene.image.ImageView;

public class Couleur {
	int x,y;
	String image;
	



	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	String coleur;

	public Couleur(int x, int y,String couleur,String image) {
		this.x=x;
		this.y=y;
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
