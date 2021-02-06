package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import models.Joueur;

public class AccueilController {

    @FXML
    private Button singlePlayerButton;

    @FXML
    private Button aboutButton;

    @FXML
    private Button exitButton;

    @FXML
    void ajouterPlayer() {
    	Joueur joueur1 = new Joueur("latifa",1) {
		};
		
    }

}
