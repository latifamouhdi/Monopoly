package cases;

import java.util.ArrayList;
import java.util.Random;

import models.Carte;
import models.Case;
import models.Rand;
public class Chance extends Case{
	public  Carte carte;
	
	public Rand rand;
	
	public static ArrayList<String> listes = new ArrayList<String>() { 
        { 
//            add("Amende pour exc�s de vitesse"); 
            add("La banque vous verse un dividende de 300 $");
        //    add("Vous �tes impos� pour les r�parations de voirie"); 
//            add("Avancez jusqu'� la case d�part");
            add("Payez les frais scolarit� 500 $"); 
 //           add("Rendez-vous Rue de la Paix");
 //           add("Carte \"sortie de prison\""); 
 //           add("Rendez-vous � l'Avenue Henri-Martin Si vous passez par la case d�part, recevez 200");
  //          add("Faites des r�parations dans toutes vos maisons"); 
//            add("Avancez au Bd de la Vilette\r\n"
//            		+ "Si vous passez par la case D�part, recevez 20KF");
//            add("Allez � la gare de Lyon\r\n"
//            		+ "Si vous passez par la case D�part, recevez 20KF"); 
 //           add("Votre immeuble et votre pr�t rapportent.");
            add("Allez en prison. Ne franchissez pas la case d�part Ne touchez pas 200 $"); 
//            add("Reculez de 3 cases");
            add("Sortir de prison"); 
            add("Vous avez gagn� 1000");
        } 
    }; 
    
    public static String  getCarte(int x) {
 //   	int nombre;
//    	Random rand = new Random();
//    	nombre = 1+rand.nextInt(5);
//		System.out.println("rand =	"+nombre);
//		System.out.println("la carte trouv�e est :	"+listes.get(nombre-1));
    	return listes.get(x);
    	
		
	}
	public static int[][] position =
		{
		{ 3, 10 } ,
		{ 2, 0 } ,
		{ 10, 6 } ,
		};

	@Override
	public String description() {
		return "Chance";
	}


}
