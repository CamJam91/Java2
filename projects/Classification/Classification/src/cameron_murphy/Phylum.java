package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//aggregate class for animalia kingdom objects

public class Phylum {
	private String phylum;
	
	/**
	 * Phylum class objects are normally instantiated by kingdom class
	 * @param phylum
	 */
	public Phylum(String phylum) {
		this.phylum = phylum;
	}
	
	//getters
		public String getPhylum() {
			return phylum;
		}
		
			//setters
		public void setPhylum(String phylum) {
			this.phylum = phylum;
		}
}
