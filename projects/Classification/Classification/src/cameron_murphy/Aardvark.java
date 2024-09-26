package cameron_murphy;

public class Aardvark extends Species implements AntEater {
	String name;
	int antsEaten = 0;
	
		//Constructors
	public Aardvark(String kingdom, String tier, String className, String order, String family, String genus, String species,
			Boolean extinct, String name) {
		super(kingdom, tier, className, order, family, genus, species,extinct);
		this.name = name;
	}
		
		//getters
	public String getName() {
		return name;
		}
			//Overrides
	@Override
	public int getAntsEaten() {
		return antsEaten;
	}
	
		//setters
	public void setName(String name) {
		this.name = name;
	}
		//overrides
	@Override
	public void eatAnt() {
		antsEaten++;
	}
	@Override
	public String toString() {
		return super.toString() + " Name: " + name + " Ants Eaten: " + String.valueOf(antsEaten);
	}
}
