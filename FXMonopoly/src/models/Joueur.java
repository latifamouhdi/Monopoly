package models;

import java.util.ArrayList;
import java.util.HashMap;


public class Joueur {
	
	static HashMap<String,Integer > colorGrp = new HashMap<String,Integer>(); { 
        {  
          	colorGrp.put("brown", 0);
        	colorGrp.put("blue", 0);
        	colorGrp.put("move", 0);
        	colorGrp.put("orange", 0);
        	colorGrp.put("red", 0);
        	colorGrp.put("yellow", 0);
        	colorGrp.put("green", 0);
        	colorGrp.put("blue ghami9", 0);
    		
 
        } 
    }; 
	
	public static HashMap<String, Integer> getColorGrp() {
		return colorGrp;
	}

	public static void setColorGrp(HashMap<String, Integer> colorGrp) {
		Joueur.colorGrp = colorGrp;
	}
	public Boolean estEnPrison;
	public static int agrent;
	public static String nom;
	public static String coleur;
	public static Pion pion;
	public static int x,y;
	public int carteprison;
	public Boolean doubl1e = false;
	public Boolean getDoubl1e() {
		return doubl1e;
	}

	public void setDoubl1e(Boolean doubl1e) {
		this.doubl1e = doubl1e;
	}

	public int getD1() {
		return d1;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	public  int d1,d2;
     private int com =0;
	
	
	
	
	public int getCarteprison() {
		return carteprison;
	}

	public void setCarteprison(int carteprison) {
		this.carteprison = carteprison;
	}

	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public Joueur(String nom, Pion pion) {
		this.nom = nom;
		this.pion=pion;
	}

	public static String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
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

	public static int getAgrent() {
		return agrent;
	}

	public void setAgrent(int agrents) {
		this.agrent = agrents;
	}

	public String toString() {
		return "Joueur [agrent=" + agrent + ", nom=" + nom + ", pion=" + pion + "]";
	}

	public Boolean getEstEnPrison() {
		return estEnPrison;
	}

	public void setEstEnPrison(Boolean estEnPrison) {
		this.estEnPrison = estEnPrison;
	}
	public Boolean doublans (int d1,int d2) {
	
		if (d1 == d2) {
			com++;
			if(com == 3) {
				doubl1e=true ;
			
			}
		}else {
			doubl1e =false;
		}
		System.out.println("nombre de dounlons "+com);
		System.out.println("return : "+doubl1e);
			
		return doubl1e ;
		
	}

	public static String getColeur() {
		return coleur;
	}

	public static void setColeur(String coleur) {
		Joueur.coleur = coleur;
	}
	
	
	
	
}
