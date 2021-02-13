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

public class BoardController {
	
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
    
    Des de = new Des();
    
//    private int nbAleatoire() {
//    	int nombreAleatoire1 = 1 + (int)(Math.random() * ((6 - 1) + 1));
//    	return nombreAleatoire1;
//	}
    
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

}
