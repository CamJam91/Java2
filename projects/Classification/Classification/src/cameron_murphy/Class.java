package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//Class class
public class Class extends Kingdom {
	private String className;
	
	public Class(String kingdom, String className, Boolean extinct) {
		super(kingdom, extinct);
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
