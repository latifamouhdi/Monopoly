package Controllers;



import java.util.ArrayList;

import javax.swing.ButtonGroup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import models.Joueur;



public class InfoPlayerController  extends AccueilController {

	private void Start() {
		// TODO Auto-generated method stub
		  System.out.println("nombre de player "+ki);
		  System.out.println(ki);
		  
		  
		  
		 
	}
	@FXML
	private ToggleButton hatBtn;
	
    @FXML
    private TextField txt_nameJoueur;

    @FXML
    private Button red;

    @FXML
    private Button brown;

    @FXML
    private Button jaune;

    @FXML
    private Button vert;

    @FXML
    private Button bleuCiel;

    @FXML
    private Button bleuFance;

    @FXML
    private Button violet;

    @FXML
    private Button trbouch;

    @FXML
    private Button lmslo7;

    @FXML
    private Button voiture;

    @FXML
    private Button brwita;

    @FXML
    private Button bateau;
    @FXML
    private Text nbrePlayer;

    @FXML
    private Button sbat;

    @FXML
    private Button lion;

    @FXML
    private Button micro;
    
    @FXML
    private ButtonGroup tokenTBG;

    @FXML
    private Button nextBtn;
    private int counter =1;
   public ArrayList<Joueur> jr = new ArrayList<Joueur>();  
   @FXML
    void nextPlayer(ActionEvent event) {
    	counter++;
    	System.out.println(counter);
    	
    	if (counter<ki+1 ) {
		System.out.println(counter);
		nbrePlayer.setText(""+(counter));
		 jr.add( new Joueur(txt_nameJoueur.getText(), "id", "argent"));
	
	    }else {
	    	fxmlChange("/board/Board.fxml");
	    	jaune.getScene().getWindow().hide();
	    
	    }
    	}
   }
