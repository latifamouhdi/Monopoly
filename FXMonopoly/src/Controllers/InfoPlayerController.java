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

public class InfoPlayerController extends AccueilController{
	
	@FXML
    private TextField nameJoueur;

    @FXML
    private ToggleButtonGroup tokenTBG;

    @FXML
    private ToggleButton hatBtn;

    @FXML
    private ToggleButton ironBtn;

    @FXML
    private ToggleButton carBtn;

    @FXML
    private ToggleButton wheelbarrowBtn;

    @FXML
    private ToggleButtonGroup tokenTBG2;

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
    	counter++;
    	System.out.println(counter);
    	
    	if (counter<ki+1 ) {
		System.out.println(counter);
		nbrePlayer.setText(""+(counter));
		 jr.add( new Joueur(nameJoueur.getText(), "id", "argent"));
	
	    }else {
	    	fxmlChange("/board/Board.fxml");
	    	dogBtn.getScene().getWindow().hide();
	    
	    }
    	
    }
    
    

}
