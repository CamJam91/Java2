package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//class for Genus

public class Genus extends Family {
	private String genus;
	
	public Genus(String kingdom, String className, String order, String family, String genus,  Boolean extinct) {
		super(kingdom, className, order, family, extinct);
		this.genus = genus;
	}
	
		//getters
	public String getGenus() {
		return genus;
	}
	
		//setters
	public void setGenus(String genus) {
		this.genus = genus;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Genus: " + genus;
	}
}