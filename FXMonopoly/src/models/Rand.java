package models;

import java.util.Random;

public class Rand {
	public static int de1;
	private Random rand = new Random();
	
	public int lancerDes() {
		this.de1 = 1+this.rand.nextInt(5);

		return this.de1;
	}

	public  int getDe1(){
		return this.de1;
	}
//	
	

}
