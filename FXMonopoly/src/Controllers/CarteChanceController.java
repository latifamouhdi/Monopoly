package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import cases.Chance;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CarteChanceController implements Initializable{

	public Chance chance = new Chance();
	@FXML
    public  Label texteChanceLab;
	
	public static int nombreRand;
    @FXML
    private Button ok_btn;

    @FXML
    void exitCarte() {
    	
    	ok_btn.getScene().getWindow().hide();

    }

    public void changerTextLab(String txt){
    	texteChanceLab.setText(txt);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		texteChanceLab.setText(Chance.getCarte(BoardController.indice));
		
		
	}
    
    
}
