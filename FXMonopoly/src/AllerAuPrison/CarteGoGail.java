package AllerAuPrison;

import Controllers.BoardController;
import javafx.scene.image.ImageView;
import models.Joueur;
import models.Partie;


public class CarteGoGail implements MethodeGoGail{
	public Partie partie=Partie.getInstance();
	@Override
	public void allezAuprison() {
		System.out.println("tu as des doublons tu doit partir au Gail");
		partie.getListe().get(0).setX(0);
		partie.getListe().get(0).setY(10);
	}

}
