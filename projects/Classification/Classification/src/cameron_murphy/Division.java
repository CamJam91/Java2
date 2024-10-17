package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//aggregate class for plantae kingdom objects

public class Division {
	private String division;
	
	/**
	 * Division class objects are normally instantiated by kingdom class
	 * @param division
	 */
	public Division(String division) {
		this.division = division;
	}
	
		//getters
	public String getDivision() {
		return division;
	}
	
		//setters
	public void setDivision(String division) {
		this.division = division;
	}
}
