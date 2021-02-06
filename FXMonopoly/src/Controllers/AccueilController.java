package Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.Joueur;

public class AccueilController {

    @FXML
    private Button singlePlayerButton;

    @FXML
    private Button aboutButton;

    @FXML
    private Button exitButton;
    
    private Parent fxml;

    @FXML
    void ajouterPlayer() {
    	Joueur joueur1 = new Joueur("latifa",1) {
		};
		singlePlayerButton.getScene().getWindow().hide();
		Stage plateau = new Stage();
		plateau.initStyle(StageStyle.UNDECORATED);
		try {
			fxml=FXMLLoader.load(getClass().getResource("/board/Board.fxml"));
			Scene scene = new Scene(fxml);
			plateau.setScene(scene);
			plateau.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    }

    @FXML
    void exit() {
    	exitButton.getScene().getWindow().hide();
    }
}
