package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import models.Joueur;

public class CngratulationController implements Initializable {

    @FXML
    private Button ok_btn;

    @FXML
    private Label texteChanceLab;

    @FXML
    private Text comorname;

    @FXML
    void decrimenteCarte(ActionEvent event) {
    	ok_btn.getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		comorname.setText(Joueur.color_Yard);
	}
	
}


