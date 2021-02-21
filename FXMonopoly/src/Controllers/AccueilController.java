package Controllers;

import java.io.IOException;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.Partie;

public  class   AccueilController  {
	Partie partie;
    @FXML
    private Button deuxBtn;
    @FXML
    private Button troisBtn;
    @FXML
    private Button quatreBtn;
	Parent fxml;
    public static int  ki;

	@FXML
    void addNbPlayers2(ActionEvent event) {
    	fxmlChange("/accueil/infoPlayer.fxml");
    	deuxBtn.getScene().getWindow().hide();
       	ki =2;
 //      	partie.setNombreJoueurs(2);
    }
    @FXML
    void addNbPlayers3(ActionEvent event) {
    	fxmlChange("/accueil/infoPlayer.fxml");
    	deuxBtn.getScene().getWindow().hide();
       	ki =3;
  //     	partie.setNombreJoueurs(3);
    }
    @FXML
    void addNbPlayers4(ActionEvent event) {
    	fxmlChange("/accueil/infoPlayer.fxml");
    	deuxBtn.getScene().getWindow().hide();
       	ki =4;
 //      	partie.setNombreJoueurs(4);
    }
    //saisir les infomrltion des jueur 
    public void fxmlChange (String st ) {
    	Stage info = new Stage();
    	info.initStyle(StageStyle.UNDECORATED);
		try {
			fxml=FXMLLoader.load(getClass().getResource(st));
			Scene scene = new Scene(fxml);
			info.setScene(scene);
			info.show();	
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    

	

}
