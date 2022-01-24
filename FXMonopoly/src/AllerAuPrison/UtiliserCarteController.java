package AllerAuPrison;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import models.Partie;

public class UtiliserCarteController implements Initializable{

    @FXML
    private Label lab_nb_carte;

    @FXML
    private Button btn_oui;

    @FXML
    private Button btn_non;

    Partie partie=Partie.getInstance();
    @FXML
    void decrementeCarte() {
    	if(partie.getListe().get(0).getCarteprison()>0) {
    		partie.getListe().get(0).setCarteprison(partie.getListe().get(0).getCarteprison()-1);
        	System.out.println("vous etes libre \n");
        	System.out.println("nombre carte sortir de prison = "+partie.getListe().get(0).getCarteprison());
        	partie.getListe().get(0).setEstEnPrison(false);
    	}else {
    		System.out.println("vous avez pas de carte sortir de prison!");
    	}
    	
    }

    @FXML
    void exit() {
    	 btn_non.getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lab_nb_carte.setText(""+partie.getListe().get(0).getCarteprison());
		
	}

}
