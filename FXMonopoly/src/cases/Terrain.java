package cases;

import java.util.ArrayList;

import models.Couleur;

public class Terrain extends Propriete{
	public static int prix=100;
	
	static ArrayList<Couleur> liste = new ArrayList<Couleur>() { 
        { 
            add(new Couleur(9, 10, "brown","brown9")); 
    		add(new Couleur(7, 10, "brown","brown7"));
    		
    		add(new Couleur(4, 10, "blue","blueciel4"));
    		add(new Couleur(2, 10, "blue","blueciel2"));
    		add(new Couleur(1, 10, "blue","blueciel1"));
    		
    		add(new Couleur(0, 9, "move","move9"));
    		add(new Couleur(0, 7, "move","move7"));
    		add(new Couleur(0, 6, "move","move6"));
    		
    		add(new Couleur(0, 4, "orange","orange4"));
    		add(new Couleur(0, 2, "orange","orange2"));
    		add(new Couleur(0, 1, "orange","orange1"));
    		
    		add(new Couleur(1, 0, "red","red1"));
    		add(new Couleur(3, 0, "red","red3"));
    		add(new Couleur(4, 0, "red","red4"));
    		
    		add(new Couleur(6, 0, "yellow","yellow6"));
    		add(new Couleur(7, 0, "yellow","yellow7"));
    		add(new Couleur(9, 0, "yellow","yellow9"));
    		
    		add(new Couleur(10, 1, "green","green1"));
    		add(new Couleur(10, 2, "green","green2"));
    		add(new Couleur(10, 4, "green","green4"));
    		
    		add(new Couleur(10, 7, "blue ghami9","blue7"));
    		add(new Couleur(10, 9, "blue ghami9","blue9"));
        } 
    }; 
	
	
	
//	public static int[][] position =
//		{
//		{ 9, 10 } ,
//		{ 7, 10 } ,
//		{ 4, 10 } ,
//		{ 2, 10 } ,
//		{ 1, 10 } ,
//		{ 0, 9 } ,
//		{ 0, 9 } ,
//		{ 0, 6 } ,
//		{ 0, 4 } ,
//		{ 0, 2 } ,
//		{ 0, 1 } ,
//		{ 1, 0 } ,
//		{ 3, 0 } ,
//		{ 4, 0 } ,
//		{ 6, 0 } ,
//		{ 7, 0 } ,
//		{ 9, 0 } ,
//		{ 10, 1 } ,
//		{ 10, 2 } ,
//		{ 10, 4 } ,
//		{ 10, 7 } ,
//		{ 10, 9 } ,
//		};

	
	public Terrain(int prix) {
		this.prix=100;
	}

	@Override
	public String description() {
		return "Terrain";
	}

	public static ArrayList<Couleur> getListe() {
		return liste;
	}

	
	
	

	
}
