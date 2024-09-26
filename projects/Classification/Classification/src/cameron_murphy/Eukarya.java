package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
// Abstract class for making Eukaryatic classifications

public abstract class Eukarya {
	final String domain = "Eukarya";
	private Boolean extinct;
	
	public Eukarya(Boolean extinct) {
		this.extinct = extinct;
	};
	

		//getters
	public String getDomain() {
		return domain;
	}
	public Boolean getExtinct() {
		return extinct;
	}
	
		//setters
	public void setExtinct(Boolean extinct) {
		this.extinct = extinct;
	}
		//abstracts
	public abstract String toString();

}
