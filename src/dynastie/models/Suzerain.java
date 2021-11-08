package dynastie.models;

import java.util.HashSet;
import java.util.Set;

public class Suzerain extends Homme {
	private Set<Sacre> sacres;

	public Suzerain(String nom, String surnom) {
		super(nom, surnom);
		sacres = new HashSet<Sacre>();
	}

	public void sacrer(String titre, int annee, Region region) {
		sacres.add(new Sacre(this, region, annee));
	}

}
