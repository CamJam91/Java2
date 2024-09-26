package cameron_murphy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassificationTest {

	@Test
	void antTest() {
			//arrange
		Ant testAnt = new Ant("Animalia", "Antropoda", "Insecta", "Hymenoptera",
				"Formicidae", "Paraponera", "P.Clavata", false, "Bullet Ant", "Queen");
			//Act
		Boolean extinct = testAnt.getExtinct();
		String caste = testAnt.getCaste();
		testAnt.setEaten(true);
		Boolean eaten = testAnt.getEaten();
			//Assert
		assertEquals(extinct, false);
		assertEquals(caste, "QUEEN");
		assertEquals(eaten, true);

	}

}
