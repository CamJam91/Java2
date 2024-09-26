package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//Ant class for creating ant objects
public class Ant extends Species implements PreyAnimal, CasteAnimal {
	private String name;
	private Boolean eaten;
	private enum Caste{
		WORKER, SOLDIER, QUEEN
	}
	private Caste caste;
	
		//constructors
	/**
	 * Ant has an enumerated caste variable that describes its caste status, this is implemented from CasteAnimal  
	 * @param kingdom
	 * @param tier
	 * @param className
	 * @param order
	 * @param family
	 * @param genus
	 * @param species
	 * @param extinct
	 * @param name
	 * @param caste
	 */
	public Ant(String kingdom, String tier, String className, String order, String family, String genus, String species,
			Boolean extinct, String name, String caste) {
		super(kingdom, tier, className, order, family, genus, species,extinct);
		this.name = name;
		setCaste(caste);
	}
	
		//getters
	public String getName() {
		return name;
	}

			//interface overrides
	@Override
	public String getCaste() {
		return caste.toString();
	}
	@Override
	public Boolean getEaten() {
		return eaten;
	}

		//setters
	public void setName(String name) {
		this.name = name;
	}
			//interface overrides
	@Override
	public void setCaste(String caste) {
		this.caste = Caste.valueOf(caste.toUpperCase());
	}
	@Override
	public void setEaten(Boolean eaten) {
		this.eaten = eaten;
	}
	
	@Override
	public String toString() {
		String preyStatus;
		if (eaten)
			preyStatus = "This animal has been eaten";
		else
			preyStatus = "This animal is alive";
		return super.toString() + " Name: " + name + " Caste: " + String.valueOf(caste) + " " + preyStatus;
	}

	
}
