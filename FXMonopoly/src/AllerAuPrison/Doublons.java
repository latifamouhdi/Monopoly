package AllerAuPrison;

import models.Partie;

public class Doublons implements MethodeGoGail {
	public Partie partie=Partie.getInstance();
	@Override
	public void allezAuprison() {
		System.out.println("tu as des doublons tu doit partir au Gail");

	}

}
