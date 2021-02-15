package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FenetreController {

    @FXML
    private Button btn_nom;

    @FXML
    void exit() {

    	btn_nom.getScene().getWindow().hide();
    }

}
