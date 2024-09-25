package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
// Abstract class for making Eukaryatic classifications

public abstract class Eukarya {
	final String domain = "Eukarya";
	private String kingdom;
	private Boolean extinct;
	private Object tier;
	
	public Eukarya(String kingdom, Boolean extinct) {
		this.kingdom = kingdom;
		this.extinct = extinct;
		if(kingdom.toLowerCase().equals("animalia")) {
			tier = new Phylum();
		}else if(kingdom.toLowerCase().equals("plantae")) {
			tier = new Division();
		}
		this.extinct = extinct;
	};
	

		//getters
	public String getDomain() {
		return domain;
	}
	public String getKingdom() {
		return kingdom;
	}
	public Boolean getExtinct() {
		return extinct;
	}
	public Object getTier() {
		return tier;
	}
	
		//setters
	public void setExtinct(Boolean extinct) {
		this.extinct = extinct;
	}
		//abstracts
	public abstract String toString();

}
