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

public  class   AccueilController  {
	
	
	protected String ss ="ff";
    @FXML
    private Button deuxBtn;

    @FXML
    private Button troisBtn;

    @FXML
    private Button quatreBtn;
    
    protected int nbJoueurs;
    protected int nb= 5;
    
	Parent fxml;
	
    public static int  ki;

	@FXML
    void addNbPlayers2(ActionEvent event) {
		Stage info = new Stage();
    	info.initStyle(StageStyle.UNDECORATED);
		try {
			System.out.println("hi");
			fxml=FXMLLoader.load(getClass().getResource("/accueil/infoPlayer.fxml"));
			Scene scene = new Scene(fxml);
			info.setScene(scene);
			info.show();
			deuxBtn.getScene().getWindow().hide();
			ki =2;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		setNbJoueurs(2); 	
    }

    @FXML
    void addNbPlayers3(ActionEvent event) {
    	setNbJoueurs(3);
    	fxmlChange("/accueil/infoPlayer.fxml");
    	deuxBtn.getScene().getWindow().hide();
       	ki =3;
    }

    @FXML
    void addNbPlayers4(ActionEvent event) {
    	
    	fxmlChange("/accueil/infoPlayer.fxml");
       	ki =4;
       	
		
	
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
		setNbJoueurs(2); 	
    }

	public int getNbJoueurs() {
		return nbJoueurs;
	}

	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
    

	

}
