package Controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
import models.Des;
import models.Joueur;
import models.Partie;
import models.Rand;

public class BoardController implements Initializable{
	
	public Terrain terrain;
	
	public static Partie Partie;
	
	@FXML
	private ImageView player1 ;

    @FXML
    private ImageView player2;

    @FXML
    private AnchorPane boardAnchor;

    @FXML
    private GridPane gridPane;

    @FXML
    private Button rollDiceButton;

    @FXML
    private Button tradeButton;

    @FXML
    private Button statsButton;

    @FXML
    private Button jailEscapeButton;

    @FXML
    private Button endTurnButton;

    @FXML
    private ImageView activePlayerSprite;

    @FXML
    private Label activePlayerName;
    
    @FXML
    private Button startBtn;

    @FXML
    private Label activePlayerCash;

    @FXML
    private Label activePlayerLocationName;

    @FXML
    private Button iconifiedButton;

    @FXML
    private Button exitButton;

    @FXML
    private ImageView userSprite;

    @FXML
    private Label userCash;

    @FXML
    private ScrollPane scroll;

    @FXML
    private TextFlow printOut;

    public CarteChanceController carteChanceController;
    private Parent fxml;
    
    @FXML
    private ImageView imgBtnDe;
    
    @FXML
    private ImageView imgDe1;

    @FXML
    private ImageView imgDe2;
    
    public static int indice;
    
    @FXML
    private static Label lab;
    
    @FXML
    private AnchorPane anchorpaneback;
    
    @FXML
    private AnchorPane startFenetre;
    
    @FXML
    private Pane panetest;
    
    Des de = new Des();
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	Image img1 = new Image("/ressources/images/"+Partie.getListe().get(0).getPion().getDescription()+".png");
    	this.player1.setImage(img1);
    	Image img2 = new Image("/ressources/images/"+Partie.getListe().get(1).getPion().getDescription()+".png");
    	this.player2.setImage(img2);
		
    	
	}
    
    
    private void moveplayer(ImageView image,int x, int y) {
    	
    	Partie.getInstance().getListe().get(0).setX(x);
    	Partie.getInstance().getListe().get(0).setY(y);
    	
    	GridPane.setConstraints(image, x, y);
    	
    	//verfier x du player et x du gare
    	for(int j = 0; j < Gare.position.length; ++j) {
    		if(Gare.position[j][0]==x && Gare.position[j][1]==y) {
    			System.out.println("tu es dans la gare! \n");
    			
    		}
    	}
    	
    	for(int j = 0; j < AllerPrison.position.length; ++j) {
    		if(AllerPrison.position[j][0]==x && AllerPrison.position[j][1]==y) {
    			System.out.println("tu es dans aller en prison! \n");
    		}
    	}
    	
    	for(int j = 0; j < CaisseCommunaute.position.length; ++j) {
    		if(CaisseCommunaute.position[j][0]==x && CaisseCommunaute.position[j][1]==y) {
    			System.out.println("tu es dans caisse communaute! \n");
    		}
    	}
    	
    	for(int j = 0; j < Chance.position.length; ++j) {
    		if(Chance.position[j][0]==x && Chance.position[j][1]==y) {
    			System.out.println("****tu es dans la chance!**** \n");
    			System.out.println("avant les operation le joueur:	"+Partie.getInstance().getListe().get(0).getNom()+"	a"+Partie.getInstance().getListe().get(0).getAgrent()+"	\n");
    			Rand r = new Rand();
    			r.lancerDes();
    			indice=r.getDe1()-1;
    			System.out.println("r.getDe=  "+r.getDe1());
    			System.out.println("r.lancerDes =  "+r+" \n");
    			System.out.println("indice=  "+indice+" \n");
    			System.out.println("chance.getcarte(indice)=   "+Chance.getCarte(indice));
    			if(Chance.getCarte(indice)=="La banque vous verse un dividende de 300 $") {
    				System.out.println("---La banque vous verse un dividende de 300 $--- \n");
    				int argent=Partie.getInstance().getListe().get(0).getAgrent();
    				Partie.getInstance().getListe().get(0).setAgrent(argent+300);
    				System.out.println("apres setArgent :	"+Partie.getInstance().getListe().get(0).getAgrent()+"	\n"	);
    			}
    			else if(Chance.getCarte(indice)=="Payez les frais scolarit� 500 $") {
    				System.out.println("---Payez les frais scolarit� 500 $--- \n");
    				int argent=Partie.getInstance().getListe().get(0).getAgrent();
    				Partie.getInstance().getListe().get(0).setAgrent(argent-500);
    				System.out.println("apres setArgent	:	"+Partie.getInstance().getListe().get(0).getAgrent()+"	\n");
    			}
    			else if(Chance.getCarte(indice)=="Allez en prison. Ne franchissez pas la case d�part Ne touchez pas 200 $") {
    				System.out.println("---Allez en prison. Ne franchissez pas la case d�part Ne touchez pas 200 $--- \n");
    				System.out.println("avant de partir X =  "+Partie.getInstance().getListe().get(0).getX()+"	\n");
    				System.out.println("avant de partir Y =  "+Partie.getInstance().getListe().get(0).getY()+"	\n");
    				Partie.getInstance().getListe().get(0).setX(0);
    				Partie.getInstance().getListe().get(0).setY(10);
    				moveplayer(player1, 0, 10);
    				System.out.println("apres de partir X =  "+Partie.getInstance().getListe().get(0).getX()+"	\n");
    				System.out.println("apres de partir Y =  "+Partie.getInstance().getListe().get(0).getY()+"	\n");
    			}
    			else if(Chance.getCarte(indice)=="Sortir de prison") {
    				System.out.println("---Sortir de prison---	\n");
    				if(Partie.getInstance().getListe().get(0).getEstEnPrison()==true) {
    					Partie.getInstance().getListe().get(0).setEstEnPrison(false);
    					System.out.println("vous etes hors prison	\n");
    				}
    				else {
    					System.out.println();
    				}
    				System.out.println("---------affichage estEnPrison-------- \n");
    				System.out.println(Partie.getInstance().getListe().get(0).getEstEnPrison());
    				moveplayer(player1, 0, 10);
    				
    			}
    			else if(Chance.getCarte(indice-1)=="Vous avez gagn� 1000") {
    				System.out.println("---Vous avez gagn� 1000--- \n");
    				int argent=Partie.getInstance().getListe().get(0).getAgrent();
    				Partie.getInstance().getListe().get(0).setAgrent(argent+1000);
    				moveplayer(player1, 0, 10);
    				System.out.println("apres setArgent :"+Partie.getInstance().getListe().get(0).getAgrent());
    			}
    			AfficherInterface aff = new AfficherInterface();
    			aff.afficher("/fenetres/carteChance.fxml");
    			
    			
    		}
    	}
    	
    	for(int j = 0; j < Compagnie.position.length; ++j) {
    		if(Compagnie.position[j][0]==x && Compagnie.position[j][1]==y) {
    			System.out.println("tu es dans la compagnie!");
    		}
    	}
    	
    	for(int j = 0; j < Go.position.length; ++j) {
    		if(Go.position[j][0]==x && Go.position[j][1]==y) {
    			System.out.println("tu es dans Go!");
    		}
    	}
    	
    	for(int j = 0; j < Impot.position.length; ++j) {
    		if(Impot.position[j][0]==x && Impot.position[j][1]==y) {
    			System.out.println("tu es dans impot!");
    		}
    	}
    	
    	for(int j = 0; j < ParcGratuit.position.length; ++j) {
    		if(ParcGratuit.position[j][0]==x && ParcGratuit.position[j][1]==y) {
    			System.out.println("tu es dans parc pratuit!");
    		}
    	}
    	
    	for(int j = 0; j < Prison.position.length; ++j) {
    		if(Prison.position[j][0]==x && Prison.position[j][1]==y) {
    			System.out.println("tu es dans prison!");
    		}
    	}
    	
    	for(int j = 0; j < Taxe.position.length; ++j) {
    		if(Taxe.position[j][0]==x && Taxe.position[j][1]==y) {
    			System.out.println("tu es dans taxe!");
    		}
    	}
    	
    	for(int j = 0; j < Terrain.getListe().size(); ++j) {
    		
    		if(Terrain.getListe().get(j).getX()==x && Terrain.getListe().get(j).getY()==y) {
    			System.out.println("tu es dans un Terrain!"+Terrain.getListe().get(j).getColeur()+
    					"tu doit payer "+Terrain.prix);
    			AfficherInterface aff=new AfficherInterface();
    			aff.afficher("/fenetres/fenetre.fxml");
    		}
    		
    	}
    	Partie.getListe().get(0).setX(x);
    	Partie.getListe().get(0).setY(y);
    	System.out.println("le joueur "+Partie.getListe().get(0).getNom()+
    			"a: \n X= "+Partie.getListe().get(0).getX()+"et Y ="+Partie.getListe().get(0).getY());
    	
    	
	}
    
    
    public static int somme;
    @FXML
    void lancerDe() {
    	de.lancerDes();
    	int de1 = de.getDe1();
    	Image imgde1 = new Image("/ressources/images/de"+de1+".jpg");
        imgDe1.setImage(imgde1);
        int de2 = de.getDe2();
        Image imgde2 = new Image("/ressources/images/de"+de2+".jpg");
        imgDe2.setImage(imgde2);
        somme=somme+de.getDes();
        
        if(somme>40) {
        	somme=somme-40;
        }
        if(somme<10 ) {
        	moveplayer(player1, 10-somme, 10);
        }else if (somme<20){
        	moveplayer(player1, 0, 20-somme);
        }else if (somme<30){
        	moveplayer(player1, 10-(30-somme), 0);
        }else if (somme<40){
        	moveplayer(player1,  10,10-(40-somme));
        }      
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

	
    
    

}
