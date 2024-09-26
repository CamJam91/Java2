package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//class for Family

public class Family extends Order {
	private String family;
	
	/**
	 * @param kingdom
	 * @param tier
	 * @param className
	 * @param order
	 * @param family
	 * @param extinct
	 */
	public Family(String kingdom, String tier, String className, String order, String family,  Boolean extinct) {
		super(kingdom, tier, className, order,extinct);
		this.family = family;
	}
	
		//getters
	public String getFamily() {
		return family;
	}
	
		//setters
	public void setFamily(String family) {
		this.family = family;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Family: " + family;
	}
}
