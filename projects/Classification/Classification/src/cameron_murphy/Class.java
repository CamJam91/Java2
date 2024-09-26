package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//Class class
public class Class extends Kingdom {
	private String className;
	
	/**
	 * @param kingdom
	 * @param tier
	 * @param className
	 * @param extinct
	 */
	public Class(String kingdom, String tier, String className, Boolean extinct) {
		super(kingdom, tier, extinct);
		this.className = className;
	}
	
		//getters
	public String getClassName() {
		return className;
	}
		
		//setters
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Class: "  + className;
	}
	
}
