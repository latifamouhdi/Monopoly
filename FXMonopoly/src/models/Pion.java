package models;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pion {
	String description;
	public  ImageView player;
	

	public ImageView getPlayer() {
		return player;
	}

	public void setPlayer(ImageView player) {
		this.player = player;
	}

	public void setPlayer(Image img1) {
		this.player = player;
	}

	public Pion(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
