package cameron_murphy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassificationTest {

	@Test
	void antTest() {
			//arrange
		Ant testAnt = new Ant("Animalia", "Anthropoda", "Insecta", "Hymenoptera",
				"Formicidae", "Paraponera", "P.Clavata", false, "Bullet Ant", "Queen");
			//Act
		Boolean extinct = testAnt.getExtinct();
		String caste = testAnt.getCaste();
		testAnt.setEaten(true);
		Boolean eaten = testAnt.getEaten();
		String domain = testAnt.getDomain();
		Phylum phylum = (Phylum) testAnt.getTier();
			//Assert
		assertEquals(extinct, false);
		assertEquals(caste, "QUEEN");
		assertEquals(eaten, true);
		assertEquals(domain, "Eukarya");
		assertEquals(phylum.getPhylum(), "Anthropoda");
	}
	
	@Test
	void aardvarkTest() {
			//Arrange
		Aardvark testAardvark = new Aardvark("Animalia", "Chordata", "Mammalia", "Tubulidentata", "Orycteropodidae", 
				"Orycteropus", "O.afer", false, "African Ant Bear");
			//Act
		Phylum phylum = (Phylum)testAardvark.getTier();
		for (int count = 0; count < 196; count++) {
			testAardvark.eatAnt();
		}
		int antsEaten = testAardvark.getAntsEaten();
			//Act
		assertEquals(phylum.getPhylum(), "Chordata");
		assertEquals(antsEaten, 196);
	}

}
