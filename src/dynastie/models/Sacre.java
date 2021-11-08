package dynastie.models;

public class Sacre {
	private int annee;
	private Suzerain suzerain;
	private Region region;

	public Sacre(Suzerain suzerain, Region region, int annee) {
		this.annee = annee;
		this.suzerain = suzerain;
		this.region = region;
	}

}
