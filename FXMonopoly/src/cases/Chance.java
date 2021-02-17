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
//            add("Amende pour excès de vitesse"); 
            add("La banque vous verse un dividende de 300 $");
        //    add("Vous êtes imposé pour les réparations de voirie"); 
//            add("Avancez jusqu'à la case départ");
            add("Payez les frais scolarité 500 $"); 
 //           add("Rendez-vous Rue de la Paix");
 //           add("Carte \"sortie de prison\""); 
 //           add("Rendez-vous à l'Avenue Henri-Martin Si vous passez par la case départ, recevez 200");
  //          add("Faites des réparations dans toutes vos maisons"); 
//            add("Avancez au Bd de la Vilette\r\n"
//            		+ "Si vous passez par la case Départ, recevez 20KF");
//            add("Allez à la gare de Lyon\r\n"
//            		+ "Si vous passez par la case Départ, recevez 20KF"); 
 //           add("Votre immeuble et votre prêt rapportent.");
            add("Allez en prison. Ne franchissez pas la case départ Ne touchez pas 200 $"); 
//            add("Reculez de 3 cases");
            add("Sortir de prison"); 
            add("Vous avez gagné 1000");
        } 
    }; 
    
    public static String  getCarte(int x) {
 //   	int nombre;
//    	Random rand = new Random();
//    	nombre = 1+rand.nextInt(5);
//		System.out.println("rand =	"+nombre);
//		System.out.println("la carte trouvée est :	"+listes.get(nombre-1));
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
