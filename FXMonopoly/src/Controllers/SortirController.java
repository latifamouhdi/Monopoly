package Controllers;

import Sortirdeprison.CarteSortir;

import Sortirdeprison.Context;
import Sortirdeprison.DetDesDouble;
import Sortirdeprison.Payemnts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SortirController {
	 @FXML
	    private Button gete_btn;
	    @FXML
	    private Button paiement_btn;
	    @FXML
	    private Label texteChanceLab;
	    @FXML
	    private Button oui_btn;
		   @FXML
		    void paymente() {
			    Context ctx = new Context ();
				ctx.setTr(new Payemnts());
				ctx.appliSTR();
				paiement_btn.getScene().getWindow().hide();
		    }
		   @FXML
		    void cartePrison() {
			    Context ctx = new Context ();
				ctx.setTr(new CarteSortir());
				ctx.appliSTR();
				paiement_btn.getScene().getWindow().hide();        
		    }
		   @FXML
		    void geteDes() {
			    Context ctx = new Context ();
			      DetDesDouble de = new DetDesDouble();
			      de.setX1(BoardController.des1);
			      de.setY1(BoardController.des1);
				  ctx.setTr(de);		
				  ctx.appliSTR();
				paiement_btn.getScene().getWindow().hide();
		    }
    @FXML
    void decrimenteCarte() {

    }
    @FXML
    void exitCarte() {
    }

}
