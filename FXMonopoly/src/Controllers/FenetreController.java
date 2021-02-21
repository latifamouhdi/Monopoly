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

import java.util.Map.Entry;
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
	static String coleur;
    @FXML
    void acheterTerrain() {
    	
    	int x=partie.getListe().get(BoardController.tour).getX();
    	int y=partie.getListe().get(BoardController.tour).getY();
    	String temp;
    	
    	for (int i =0;i<Terrain.getListe().size();i++) {
    		if (Terrain.getListe().get(i).getX()==x && Terrain.getListe().get(i).getY()==y) {
    			
    			image_name = Terrain.getListe().get(i).getImage();
    			coleur = Terrain.getListe().get(i).getColeur();
    		
    			// yurne la valeur de vendu true 
    			Terrain.getListe().get(i).setVendu(true);
    			//informer le jpoueur que vous aver acheter un terrain d"aprer incrementer leur Hashmap des terrain 
    			for (Entry<String, Integer> mapentry : Partie.getListe().get(BoardController.tour).getColorGrp().entrySet()) {
    	    		
    				if (mapentry.getKey()== coleur){	
        				temp =mapentry.getKey();
        				System.out.println("ID"+mapentry.getKey());
        				System.out.println("value"+mapentry.getValue());
        				mapentry.setValue(mapentry.getValue()-1);
    				}  			
    		}
    			
    	} 
    }
    	//verify si le joueur possed tous les terran de meme couleur
    	partie.getListe().get(BoardController.tour).checkAll();
    	
    	partie.getListe().get(BoardController.tour).setAgrent(partie.getListe().get(BoardController.tour).getAgrent()-500);
    	System.out.println("vous avez payer 500  et donc vous avez acheter un terrain  ");
    	System.out.println("argent "+partie.getListe().get(BoardController.tour).getAgrent());
    	btn_nom.getScene().getWindow().hide();
    }
    @FXML
    void exit() {

    	btn_nom.getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
