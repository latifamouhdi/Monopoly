package Controllers;


import java.io.IOException;




import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



import AllerAuPrison.FabriqueGoGail;
import AllerAuPrison.MethodeGoGail;
import Sortirdeprison.CarteSortir;
import Sortirdeprison.Context;

import Sortirdeprison.Payemnts;
import Sortirdeprison.SortirDePrison;
import cases.AllerPrison;
import cases.CaisseCommunaute;
import cases.Chance;
import cases.Compagnie;
import cases.Gare;
import cases.Go;
import cases.Impot;
import cases.ParcGratuit;
import cases.Prison;
import cases.Propriete;
import cases.Taxe;
import cases.Terrain;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.AfficherInterface;
import models.Case;
import models.Des;
import models.Joueur;
import models.Partie;
import models.Rand;

public class BoardController implements Initializable{

    @FXML
    private Label activePlayerName;

    @FXML
    private Pane blueciel2_2;

    @FXML
    private ImageView imgBtnDe;

    @FXML
    private Pane orange1_1;

    @FXML
    private Pane blue9;

    @FXML
    private Pane blue7;

    @FXML
    private Label userCash;

    @FXML
    private Pane yellow6;

    @FXML
    private Pane yellow7;

    @FXML
    private Button iconifiedButton;

    @FXML
    private AnchorPane boardAnchor;

    @FXML
    private Pane yellow9;

    @FXML
    private Pane yellow6_6;

    @FXML
    private Button jailEscapeButton;

    @FXML
    private Pane blue7_7;

    @FXML
    private TextFlow printOut;

    @FXML
    private Button statsButton;

    @FXML
    private Pane move7_7;

    @FXML
    private Pane orange4;

    @FXML
    private Pane orange2;

    @FXML
    private Pane orange1;

    @FXML
    private Pane green4;

    @FXML
    private ScrollPane scroll;

    @FXML
    private ImageView activePlayerSprite;

    @FXML
    private Pane move6;

    @FXML
    private Pane move7;

    @FXML
    private Pane red3_3;

    @FXML
    private Pane green2;

    @FXML
    private Pane red1_1;

    @FXML
    private Pane green1;

    @FXML
    private Pane green2_2;

    @FXML
    private Pane green4_4;

    @FXML
    private Pane move9;

    @FXML
    private GridPane gridPane;

    @FXML
    private Pane blueciel4_4;

    @FXML
    private Pane blueciel1_1;

    @FXML
    private Pane blueciel1;

    @FXML
    private Pane blueciel2;

    @FXML
    private Pane blueciel4;

    @FXML
    private Pane orange4_4;

    @FXML
    private Label activePlayerLocationName;

    @FXML
    private Pane orange2_2;

    @FXML
    private ImageView imgDe1;

    @FXML
    private Pane yellow9_9;

    @FXML
    private ImageView imgDe2;

    @FXML
    private Button rollDiceButton;

    @FXML
    private ImageView finiched;

    @FXML
    private Pane yellow7_7;

    @FXML
    private Pane brown7_7;

    @FXML
    private Pane move9_9;

    @FXML
    private Pane brown9_9;

    @FXML
    private Pane move6_6;

    @FXML
    private Pane blue9_9;

    @FXML
    private Pane green1_1;

    @FXML
    private Pane red4_4;

    @FXML
    private Pane red1;

    @FXML
    private Pane red3;

    @FXML
    private Pane red4;

    @FXML
    private Pane brown9;

    @FXML
    private Pane brown7;
   
	public Terrain terrain;
	
	public static Partie partie;
	
	@FXML
	private ImageView player1 ;

    @FXML
    private ImageView player2;

    @FXML
    private Button tradeButton;

    @FXML
    private Button endTurnButton;
    
    @FXML
    private Button startBtn;

    @FXML
    private Label activePlayerCash;

    @FXML
    private Button exitButton;

    @FXML
    private ImageView userSprite;
    
    public CarteChanceController carteChanceController;
    private Parent fxml;
    
    public static int indice;
    
    @FXML
    private static Label lab;
    
    
    @FXML
    private Button oui_btn;
    @FXML
    private Button non_btn;    
    @FXML
    private AnchorPane anchorpaneback;  
    @FXML
    private AnchorPane startFenetre;  
    @FXML
    private Pane panetest;
    public static int des1 ;//utilisation pour changer l'image de des ou cas ou tu es dans le gail et tu veux sortir chaoisisant get de des 
    public static int des2;
    public static int tour;//pour indiquer le tour d chazque playyer 
    @FXML
    private FenetreController fenetreController;
  public   static int round =0;

    Des de = new Des();
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	partie=Partie.getInstance();
    	Image img1 = new Image("/ressources/images/"+Partie.getListe().get(0).getPion().getDescription()+".png");
    	this.player1.setImage(img1);
    	
    	Image img2 = new Image("/ressources/images/"+Partie.getListe().get(1).getPion().getDescription()+".png");
    	this.player2.setImage(img2);
    	//test by hamza pion *
    	
    //afficher la liste des joueur
    	System.out.println("*********");
    	for(Joueur j:partie.getListe()) {
    		System.out.println("le joueur	"+j.getNom()+"a le pion "+j.getPion().getDescription()+" il a "+j.getAgrent());
			System.out.println(Partie.getListe().size());
    	}
 
    	
	}
    
        
    private void moveplayer(ImageView image,int x, int y) {

		Partie.getListe().get(tour).setX(x);
		Partie.getListe().get(tour).setY(y);
       // deplacer le pion 
    	GridPane.setConstraints(image, x, y);
	   //deplacer le joueur vers la case(x,y)
  
    		
    	//verifier x du player et x du gare
    	for(int j = 0; j < Gare.position.length; ++j) {
    		if(Gare.position[j][0]==x && Gare.position[j][1]==y) {
    			System.out.println("tu es dans la gare! \n");
    			
    		}
    	}
    	    	
    	//verifier x du player et x du communite
    	
    	for(int j = 0; j < CaisseCommunaute.position.length; ++j) {
    		if(CaisseCommunaute.position[j][0]==x && CaisseCommunaute.position[j][1]==y) {
    			System.out.println("tu es dans caisse communaute! \n");
    		}
    	}
    	//verifier x du player et x du chance
    	for(int j = 0; j < Chance.position.length; ++j) {
    		if(Chance.position[j][0]==x && Chance.position[j][1]==y) {
    			System.out.println("****tu es dans la chance!**** \n");
    			Rand r = new Rand();
    			r.lancerDes();
    			indice=r.getDe1()-1;
    			
    			if(Chance.getCarte(indice)=="La banque vous verse un dividende de 300 $") {
    				System.out.println("---La banque vous verse un dividende de 300 $--- \n");
    				int argent=partie.getListe().get(tour).getAgrent();
    				partie.getListe().get(tour).setAgrent(argent+300);
    				System.out.println("apres setArgent :	"+partie.getListe().get(tour).getAgrent()+"	\n"	);
    			}
    			
    			else if(Chance.getCarte(indice)=="Payez les frais scolarité 500 $") {
    				System.out.println("---Payez les frais scolarité 500 $--- \n");
					int argent=models.Partie.getListe().get(tour).getAgrent();
					partie.getListe().get(tour).setAgrent(argent-500);
					System.out.println("apres setArgent	:	"+partie.getListe().get(tour).getAgrent()+"	\n");
    			}
    			
    			else if(Chance.getCarte(indice)=="Allez en prison. Ne franchissez pas la case départ Ne touchez pas 200 $") {
    				System.out.println("---Allez en prison. Ne franchissez pas la case départ Ne touchez pas 200 $--- \n");				
    				partie.getListe().get(tour).setX(0);
    				partie.getListe().get(tour).setY(10);
    				// joueur est dans le prison 
    				partie.getListe().get(tour).setEstEnPrison(true);
    			
    				if(tour==0) {
    	            	moveplayer(player1, 0, 10);
    	            	}else {
    	            		moveplayer(player2, 0, 10);
    	            	}
    			}
    			
    			else if(Chance.getCarte(indice)=="Sortir de prison") {
    				
    				System.out.println("---Sortir de prison---	\n");
    				partie.getListe().get(tour).setCarteprison(partie.getListe().get(tour).getCarteprison()+1);
					System.out.println("nombre de  carte sortie de prison "+partie.getListe().get(tour).getCarteprison());
    				
    			}
    			else if(Chance.getCarte(indice-1)=="Vous avez gagné 1000") {
    				System.out.println("---Vous avez gagné 1000--- \n");
					int argent=partie.getListe().get(tour).getAgrent();
					partie.getListe().get(tour).setAgrent(argent+1000);
					System.out.println("apres setArgent :"+models.Partie.getListe().get(tour).getAgrent());
    			}
    			AfficherInterface aff = new AfficherInterface();
    			aff.afficher("/fenetres/carteChance.fxml");
    		   }
    	}
    	
    	//verifier x du player et x dans la compgnie 
    	for(int j = 0; j < Compagnie.position.length; ++j) {
    		if(Compagnie.position[j][0]==x && Compagnie.position[j][1]==y) {
    			System.out.println("tu es dans la compagnie!");
    		}
    	}
    	//verifier x du player et x du Go
    	for(int j = 0; j < Go.position.length; ++j) {
    		if(Go.position[j][0]==x && Go.position[j][1]==y) {
    			System.out.println("tu es dans Go!");
    		}
    	}
    	//verifier x du player et x du impot
    	for(int j = 0; j < Impot.position.length; ++j) {
    		if(Impot.position[j][0]==x && Impot.position[j][1]==y) {
    			System.out.println("tu es dans impot!");
    		}
    	}
    	//verifier x du player et x du parque
    	for(int j = 0; j < ParcGratuit.position.length; ++j) {
    		if(ParcGratuit.position[j][0]==x && ParcGratuit.position[j][1]==y) {
    			System.out.println("tu es dans parc pratuit!");
    		}
    	}
    	//verifier x du player et x du Gail
    	for(int j = 0; j < Prison.position.length; ++j) {
    		if(Prison.position[j][0]==x && Prison.position[j][1]==y) {
    			if (partie.getListe().get(tour).getEstEnPrison()) {
    				System.out.println("Holly shit darling your in the  Gail ");

    			}else {
    				System.out.println("you are just visiting the Gail you will be arrested soon *-* ");
    			}
    			
    		}
    	}
    	
    	for(int j = 0; j < Taxe.position.length; ++j) {
    		if(Taxe.position[j][0]==x && Taxe.position[j][1]==y) {
    			System.out.println("tu es dans taxe!");
    		}
    	}
    	for(int j = 0; j < AllerPrison.position.length; ++j) {
    		if(AllerPrison.position[j][0]==x && AllerPrison.position[j][1]==y) {
    			System.out.println("tu es dans aller en prison! \n");
    			partie.getListe().get(tour).setEstEnPrison(true);
				//moveplayer(player1, 0, 10);
    			Partie.getListe().get(tour).setX(0);
    			Partie.getListe().get(tour).setY(10);
    	       // deplacer le pion 
    	    	GridPane.setConstraints(image, 0, 10);				
    		}
    	}
    	//--------------------------------terran verication-----------------------------------
    	for(int j = 0; j < Terrain.getListe().size(); ++j) {
    		
    		if(Terrain.getListe().get(j).getX()==x && Terrain.getListe().get(j).getY()==y) {
    			System.out.println("----------------------terrain process-----------");
    			if(Terrain.getListe().get(j).isVendu()) {
    				System.out.println("deja vendue Sorry  Taxe mother FUCKER");
    				//payements des tarif
    				System.out.println("Terrain  occuppere :payements des tarif 500$ ");
    				partie.getListe().get(tour).setAgrent(partie.getListe().get(tour).getAgrent()-500);
    				System.out.println("ARGENT :"+partie.getListe().get(tour).getAgrent());
    			}else {
    				
        			System.out.println("tu es dans un Terrain! :"+Terrain.getListe().get(j).getColeur()+
        					"tu doit payer: "+Terrain.prix+" ce terran est vendue :"+Terrain.getListe().get(j).isVendu());
        		//Affichage d interface 
        			AfficherInterface aff=new AfficherInterface();
        			aff.afficher("/fenetres/fenetre.fxml");
        			System.out.println("------------------------------");
    			}
    	
    			System.out.println("----------------------terrain process fi--------");
    		}
    	
    		{
    		
    			String koik =Partie.getListe().get(tour).getColeur();
        	
    			switch(FenetreController.image_name) {
            	case "brown9" :  brown9_9.setStyle("-fx-background-color:  "+koik+";");
    		                       FenetreController.image_name = "null";
    		                       break;
            	case "brown7" : brown7_7.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "blueciel4" : blueciel4_4.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "blueciel2" : blueciel2_2.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "blueciel1" : blueciel1_1.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "move9" : move9_9.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "move7" : move7_7.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "move6" : move6_6.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "orange4" : orange4_4.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "orange2" : orange2_2.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "orange1" :orange1_1.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
    
                break;
            	case "red1" : red1_1.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "red3" : red3_3.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "red4" : red4_4.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "yellow6" : yellow6_6.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "yellow7" : yellow7_7.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "yellow9" : yellow9_9.setStyle("-fx-background-color: "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "green1" : green1_1.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "green2" : green2_2.setStyle("-fx-background-color: "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "green4" : green4_4.setStyle("-fx-background-color: "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "blue7" : blue7_7.setStyle("-fx-background-color:  "+koik+";");
                FenetreController.image_name = "null";
                break;
            	case "blue9" : blue9_9.setStyle("-fx-background-color: "+koik+";");
                FenetreController.image_name = "null";
                break;                      
        	}
    	}
	}
    	models.Partie.getListe().get(tour).setX(x);
    	models.Partie.getListe().get(tour).setY(y);
    	System.out.println("le joueur :  "+Partie.getListe().get(tour).getNom()+"a: \n X = "+models.Partie.getListe().get(tour).getX()+"et Y ="+Partie.getListe().get(tour).getY());
  	
    }
    
    @FXML
    void decrimenteCarte() {
    	System.out.println("------ en train de decrementer le nombre de carte");
    	models.Partie.getInstance();
		models.Partie.getListe().get(tour).setCarteprison(models.Partie.getListe().get(tour).getCarteprison()-1);
		System.out.println("le nombre de carte devient = "+models.Partie.getListe().get(tour).getCarteprison());
    }

    @FXML
    void exitCarte() {
    	oui_btn.getScene().getWindow().hide();
    }
    public static int somme;
    
    public static int nbDoublon=0;
    @FXML
    void lancerDe() {
    	if (tour == AccueilController.ki-1) {
    		tour=0;
    		
    	}else {
    		tour++;
    	}
    
    	de.lancerDes();
    	des1=de.getDe1();
    	des2=de.getDe2();
    	
    	int de1 = de.getDe1();
    	Image imgde1 = new Image("/ressources/images/de"+de1+".jpg");
        imgDe1.setImage(imgde1);
        int de2 = de.getDe2();
        Image imgde2 = new Image("/ressources/images/de"+de2+".jpg");
        imgDe2.setImage(imgde2);
    	if(partie.getListe().get(tour).getEstEnPrison()== false)
    	   {
    		
    	round++;
    	System.out.println("*************rounde :"+round+"******************");

      System.out.println("player index : "+tour);
      System.out.println("nom player  "+ partie.getListe().get(tour).getNom());
    	
      partie.getListe().get(tour).setSommedES( partie.getListe().get(tour).getSommedES()+de.getDes());
        somme=somme+de.getDes();
        System.out.println("somme----"+partie.getListe().get(tour).getSommedES());
        if(partie.getListe().get(tour).getSommedES()>40) {
        	somme=somme-40;
        	 partie.getListe().get(tour).setSommedES( partie.getListe().get(tour).getSommedES()-40);
        }
        if(partie.getListe().get(tour).getSommedES()<10 ) {
        	if(tour==0) {
        	 moveplayer(player1, 10-partie.getListe().get(tour).getSommedES(), 10);
        	}else {
        		   moveplayer(player2, 10-partie.getListe().get(tour).getSommedES(), 10);
        	}
        }else if (partie.getListe().get(tour).getSommedES()<20){
        	if(tour==0) {
            	moveplayer(player1, 0, 20-partie.getListe().get(tour).getSommedES());
            	}else {
            		moveplayer(player2, 0, 20-partie.getListe().get(tour).getSommedES());
            	}
        }else if (partie.getListe().get(tour).getSommedES()<30){
        	if(tour==0) {
            	moveplayer(player1, 10-(30-partie.getListe().get(tour).getSommedES()), 0);
            	}else {
            		moveplayer(player2, 10-(30-partie.getListe().get(tour).getSommedES()), 0);
            	}
        }else if (partie.getListe().get(tour).getSommedES()<40){
        	if(tour==0) {
            	moveplayer(player1, 10, 10-(40-partie.getListe().get(tour).getSommedES()));
            	}else {
            		moveplayer(player2, 10, 10-(40-partie.getListe().get(tour).getSommedES()));
            	}
        }  
        
    	// verification des doublans 
    	//doublons=3 faire rentrer  au gail 
    	if (partie.getListe().get(tour).doublans(de.getDe1(),de.getDe2())) {
			partie.getListe().get(tour).setX(0);
			partie.getListe().get(tour).setY(10);
			if(tour==0) {
	        	moveplayer(player1, 10-partie.getListe().get(tour).getSommedES(), 10);
	        	}else {
	        		moveplayer(player2, 10-partie.getListe().get(tour).getSommedES(), 10);
	        	}
    	}
    	// verification si le joueur il est deja  dans le gaill
    
    	
//        if(de1==de2) {
//    		if(nombreDoublons==3) {
//    			//utilisation de la fabriqueGoGail
//				FabriqueGoGail fabrique=new FabriqueGoGail();
//				MethodeGoGail methode=fabrique.getMethode("doublons");
//				methode.allezAuprison();
//    		}else {
//    			nombreDoublons++;
//        		lancerDe();
//    		}
//    	}
    	     }else {
      		   System.out.println("sorry ypu are in the gail");
      		 AfficherInterface aff = new AfficherInterface();
 			aff.afficher("/fenetres/carteSortirPrison.fxml");
      	    }
    	System.out.println("*************fin round*****************");
    }
        
    
    
    @FXML
    void exit() {
    	exitButton.getScene().getWindow().hide();
    	Stage accueil = new Stage();
    	accueil.initStyle(StageStyle.UNDECORATED);
		try {
			fxml=FXMLLoader.load(getClass().getResource("/accueil/Accueil.fxml"));
			Scene scene = new Scene(fxml);
			accueil.setScene(scene);
			accueil.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }


	public ImageView getPlayer1() {
		return player1;
	}


	public void setPlayer1(ImageView player1) {
		this.player1 = player1;
		
	}


	public ImageView getPlayer2() {
		return player2;
	}


	public void setPlayer2(ImageView player2) {
		this.player2 = player2;
	}

	public static Label getLab() {
		return lab;
	}

	public static void setLab(Label lab) {
		BoardController.lab = lab;
	}



	public Pane getMove6() {
		return move6;
	}



	public void setMove6(Pane move6) {
		this.move6 = move6;
	}




}
