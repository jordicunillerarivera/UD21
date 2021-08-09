package JUnit.Junit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTesrt {
	
	Geometria geo;
	
	@BeforeEach
	public void before() {
		geo = new Geometria();
	}
	
	@Test
	public void testConstructorId1() {
		geo = new Geometria(1);
	}
	
	@Test
	public void testConstructorId2() {
		geo = new Geometria(2);
	}
	
	@Test
	public void testConstructorId3() {
		geo = new Geometria(3);
	}
	
	@Test
	public void testConstructorId4() {
		geo = new Geometria(4);
	}
	
	@Test
	public void testConstructorId5() {
		geo = new Geometria(5);
	}
	
	@Test
	public void testConstructorId6() {
		geo = new Geometria(6);
	}
	
	@Test
	public void testConstructorId7() {
		geo = new Geometria(7);
	}
	
	@Test
	public void testConstructorId8() {
		geo = new Geometria(8);
	}
	
	@Test
	public void testConstructorId0() {
		geo = new Geometria(0);
	}

	@Test
	public void testAreaCuadrado() {
		int resultado = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geo.areaCirculo(2);
		double esperado = 12.6064;
		double delta = 0.1; 
		assertEquals(esperado, resultado, delta);
	}
	
	@Test
	public void testAreaTriangulo() {
		double resultado = geo.areatriangulo(2, 4);
		double esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRectangulo() {
		double resultado = geo.arearectangulo(2, 4);
		double esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaPentagono() {
		double resultado = geo.areapentagono(2, 4);
		double esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void arearombo() {
		double resultado = geo.arearombo(2, 4);
		double esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRomboide() {
		double resultado = geo.arearomboide(2, 4);
		double esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTrapecio() {
		double resultado = geo.areatrapecio(2, 4, 8);
		double esperado = 24;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetId() {
		geo = new Geometria(1);
		int resultado = geo.getId();
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSetId() {
		geo.setId(2);
		int resultado = geo.getId();
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSetGetNom() {
		geo.setNom("A");
		String resultado = geo.getNom();
		String esperado = "A";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testsetGetArea() {
		geo.setArea(3);
		double resultado = geo.getArea();
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testToString() {
		int id = 1;
		String nom = "a";
		double area = 3;
		
		geo.setId(1);
		geo.setNom("a");
		geo.setArea(3);
		
		String resultado = geo.toString();
		String esperado = ("Geometria [id=" + id + ", nom=" + nom + ", area=" + area + "]"); 
		assertEquals(esperado, resultado);
	}

}
