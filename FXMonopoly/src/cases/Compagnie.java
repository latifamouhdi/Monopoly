package cases;

public class Compagnie extends Propriete{

	public Compagnie(int prix) {
		super(prix);
	}
	
	@Override
	public String description() {
		return "Compagnie";
	}


}
