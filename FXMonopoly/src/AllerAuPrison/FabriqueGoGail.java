package AllerAuPrison;

public class FabriqueGoGail {

	public MethodeGoGail getMethode(String methode) {
		
		if(methode=="doublons") {
			return new Doublons();
		}
		else if(methode=="carteGoGail") {
			return new CarteGoGail();
		}else if(methode=="caseGoGail") {
			return new CaseGoGail();
		}
		return null;
	}
}
