package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//class for Genus

public class Species extends Genus {
	private String species;
	
	/**
	 * @param kingdom
	 * @param tier
	 * @param className
	 * @param order
	 * @param family
	 * @param genus
	 * @param species
	 * @param extinct
	 */
	public Species(String kingdom, String tier, String className, String order, String family, String genus, String species,  Boolean extinct) {
		super(kingdom, tier, className, order, family, genus, extinct);
		this.species = species;
	}
	
		//getters
	public String getSpecies() {
		return species;
	}
	
		//setters
	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Species: " + species;
	}
}