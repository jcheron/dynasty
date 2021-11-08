package dynastie;

import dynastie.models.Dynastie;
import dynastie.models.Femme;
import dynastie.models.Homme;

public class CarolingienProg {

	public static void main(String[] args) {
		Dynastie dCaros = new Dynastie("Carolingiens");
		Homme pepin = new Homme("Pépin", "le Bref");
		pepin.naitre(715);
		pepin.epouser(new Femme("Berthe", "Aux grands pieds"));
		// pepin.
		pepin.mourir(768);
		dCaros.ajouter(pepin);

	}

}
