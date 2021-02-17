package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FenetreController implements Initializable{

	
	@FXML
    private Label txt_color;

    @FXML
    private Label txt_mantant;
    
    @FXML
    private Button btn_nom;

    @FXML
    void exit() {

    	btn_nom.getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
