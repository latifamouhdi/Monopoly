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

public class BoardController {

    @FXML
    private AnchorPane boardAnchor;

    @FXML
    private GridPane boardPane;

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
    
    private int nbAleatoire() {
    	int nombreAleatoire1 = 1 + (int)(Math.random() * ((6 - 1) + 1));
    	return nombreAleatoire1;
	}
    @FXML
    void lancerDe() {
    	
    	int nombreAleatoire1 = nbAleatoire();
    	Image de1 = new Image("/ressources/images/de"+nombreAleatoire1+".jpg");
        imgDe1.setImage(de1);
        int nombreAleatoire2 = nbAleatoire();
        Image de2 = new Image("/ressources/images/de"+nombreAleatoire2+".jpg");
        imgDe2.setImage(de2);
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
