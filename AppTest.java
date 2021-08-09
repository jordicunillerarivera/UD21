package JUnit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class AppTest {
	
	@Test
	void test() {
		Geometria gm=new Geometria(2);
		double areaCirc= gm.areaCirculo(2);
		gm.setArea(areaCirc); 
		double esperado = 12.6064;
		double delta = 0.1; 
		assertEquals(esperado, gm.getArea(), delta);
	}

}
