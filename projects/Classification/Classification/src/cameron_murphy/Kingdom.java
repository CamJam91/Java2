package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//implements abstract Eukarya class
public class Kingdom extends Eukarya {
	private String kingdom;
	
	public Kingdom(String kingdom, boolean extinct) {
		super(kingdom, extinct);
		this.kingdom = kingdom;
	}
	
		//getters
	public String getKingdom() {
		return kingdom;
	}

	@Override
	public String toString() {
		return "Domain: Eukarya, Kingdom: " + kingdom;
	}

}
