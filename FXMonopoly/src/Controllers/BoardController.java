package Controllers;


import java.io.IOException;
import java.util.ArrayList;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.Des;
import models.Partie;

public class BoardController extends Partie{
	
	@FXML
	private ImageView player1;

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

    private Parent fxml;
    
    @FXML
    private ImageView imgBtnDe;
    
    @FXML
    private ImageView imgDe1;

    @FXML
    private ImageView imgDe2;
    
    @FXML
    private Label lab;
    
    @FXML
    private Label lab1;

    @FXML
    private Label lab2;
    
    @FXML
    private AnchorPane anchorpaneback;
    
    @FXML
    private AnchorPane startFenetre;
    
    Des de = new Des();
    
    @FXML
    void start() {
    	Image img1 = new Image("/ressources/images/"+Partie.getListe().get(0).getPion().getDescription()+".png");
    	this.player1.setImage(img1);
    	Image img2 = new Image("/ressources/images/"+Partie.getListe().get(1).getPion().getDescription()+".png");
    	this.player2.setImage(img2);
    }
    
    
    

    
    private void moveplayer(ImageView image,int x, int y) {
    	GridPane.setConstraints(image, x, y);

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
        	System.out.println(somme);
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
        System.out.println("somme= "+somme);        
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
    
    

}
