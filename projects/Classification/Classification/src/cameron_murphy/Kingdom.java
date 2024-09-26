package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//implements abstract Eukarya class
public class Kingdom extends Eukarya {
	private String kingdom;
	private Object tier;
	
	public Kingdom(String kingdom, String tier, boolean extinct) {
		super(extinct);
		this.kingdom = kingdom;
		if(kingdom.toLowerCase().equals("animalia")) {
			Phylum tempPhylum = new Phylum("Animalia");
			this.tier = tempPhylum;
		}else if(kingdom.toLowerCase().equals("plantae")) {
			Division tempDivision = new Division("Plantae");
			this.tier = tempDivision;
		}
		this.kingdom = kingdom;
	}
	
		//getters
	public String getKingdom() {
		return kingdom;
	}
	public Object getTier() {
		return tier;
	}

	@Override
	public String toString() {
		return "Domain: Eukarya, Kingdom: " + kingdom;
	}

}
