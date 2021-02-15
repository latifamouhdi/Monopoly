package Controllers;

import java.util.ArrayList;

import com.gluonhq.charm.glisten.control.ToggleButtonGroup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import models.Joueur;
import models.Partie;
import models.Pion;

public class InfoPlayerController extends AccueilController{
	
	@FXML
    private ToggleButton red;

    @FXML
    private ToggleButton black;

    @FXML
    private ToggleButton blue;

    @FXML
    private ToggleButton green;

    @FXML
    private ToggleButton yellow;

    @FXML
    private ToggleButton pink;

    @FXML
    private ToggleButton brown;
    
	@FXML
    private ToggleButtonGroup toggleGroupColors;

    @FXML
    private ToggleButtonGroup tokenTBG1;
    
    @FXML
    private ToggleButtonGroup tokenTBG2;
    
	@FXML
    private TextField nameJoueur;

    @FXML
    private ToggleButton hatBtn;

    @FXML
    private ToggleButton ironBtn;

    @FXML
    private ToggleButton carBtn;

    @FXML
    private ToggleButton wheelbarrowBtn;

    @FXML
    private ToggleButton shipBtn;

    @FXML
    private ToggleButton bootBtn;

    @FXML
    private ToggleButton dogBtn;

    @FXML
    private ToggleButton thimbleBtn;

    @FXML
    private Button nextBtn;

    @FXML
    private Text nbrePlayer;
    
    
    private int counter =1;
    public ArrayList<Joueur> jr = new ArrayList<Joueur>(); 
    
    private void Start() {
		  System.out.println("nombre de player "+ki);
		  System.out.println(ki); 
	}
    
    @FXML
    void nextPlayer(ActionEvent event) {
    	Joueur joueur = new Joueur(nameJoueur.getText());
    	Pion pion=new Pion("");
    	nameJoueur.setText("");
    	if(red.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(0).setDisable(true);
    	}else if(black.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(1).setDisable(true);
    	}else if(blue.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(2).setDisable(true);
    	}else if(green.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(3).setDisable(true);
    	}else if(yellow.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(4).setDisable(true);
    	}else if(pink.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(5).setDisable(true);
    	}else if(brown.isSelected()==true) {
    		toggleGroupColors.getChildrenUnmodifiable().get(6).setDisable(true);
    	}
    	
    	if(hatBtn.isSelected()==true) {
    		tokenTBG1.getChildrenUnmodifiable().get(0).setDisable(true);
    		pion.setDescription("Hat");
    	}else if(ironBtn.isSelected()==true) {
    		tokenTBG1.getChildrenUnmodifiable().get(1).setDisable(true);
    		pion.setDescription("Iron");
    	}else if(carBtn.isSelected()==true) {
    		tokenTBG1.getChildrenUnmodifiable().get(2).setDisable(true);
    		pion.setDescription("Car");
    	}else if(wheelbarrowBtn.isSelected()==true) {
    		tokenTBG1.getChildrenUnmodifiable().get(3).setDisable(true);
    		pion.setDescription("Wheelbarrow");
    	}
    	
    	if(shipBtn.isSelected()==true) {
    		tokenTBG2.getChildrenUnmodifiable().get(0).setDisable(true);
    		pion.setDescription("Ship");
    	}else if(bootBtn.isSelected()==true) {
    		tokenTBG2.getChildrenUnmodifiable().get(1).setDisable(true);
    		pion.setDescription("Boot");
    	}else if(dogBtn.isSelected()==true) {
    		tokenTBG2.getChildrenUnmodifiable().get(2).setDisable(true);
    		pion.setDescription("Dog");
    	}else if(thimbleBtn.isSelected()==true) {
    		tokenTBG2.getChildrenUnmodifiable().get(3).setDisable(true);
    		pion.setDescription("Thimble");
    	}
    	
    	
    	
    	joueur.setPion(pion);
    	joueur.setAgrent(200000);
    	joueur.setEstEnPrison(false);
    	partie.setJoueur(joueur);
    	
    	counter++;
    	
    	if (counter<ki+1 ) {
		nbrePlayer.setText(""+(counter));
	    }else {
	    	for(Joueur j:partie.getListe()) {
	    		System.out.println("le joueur	"+j.getNom()+"	a le pion "+j.getPion().getDescription()+" il a "+joueur.getAgrent());
	    	};
	    	fxmlChange("/board/Board.fxml");
	    	dogBtn.getScene().getWindow().hide();
	    
	    }
    	
    	
    }
    
    

}
