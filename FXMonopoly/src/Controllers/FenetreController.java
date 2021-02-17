package Controllers;
import java.util.*;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import com.sun.javafx.collections.MappingChange.Map;

import cases.Terrain;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import models.Partie;

public class FenetreController implements Initializable{

	@FXML
    private Button btn_OUI;
	
	@FXML
    private Label txt_color;

    @FXML
    private Label txt_mantant;
    
    @FXML
    private Button btn_nom;
    static String image_name ="null";
    Partie partie = Partie.getInstance();
    
    @FXML
    void acheterTerrain() {
    	int x=partie.getListe().get(0).getX();
    	int y=partie.getListe().get(0).getY();
    	
    	for (int i =0;i<Terrain.getListe().size();i++) {
    		if (Terrain.getListe().get(i).getX()==x && Terrain.getListe().get(i).getY()==y) {
    			image_name = Terrain.getListe().get(i).getImage();
    			System.out.println("je suis "+image_name);
    			Iterator  it =Partie.getListe().get(0).getColorGrp().entrySet().iterator();
    		
    			
    			while (it.hasNext()) {
    			 
    			}
    			
    		}
    	}
    	partie.getListe().get(0).setAgrent(partie.getListe().get(0).getAgrent()-500);
    	System.out.println("vous avez payer 500  et donc vous avez acheter un terrain +colro ");
    }
    
    @FXML
    void exit() {

    	btn_nom.getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
