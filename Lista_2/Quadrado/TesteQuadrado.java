package andre.uespi.prp.br;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteQuadrado {
	Quadrado testeQ = new Quadrado();
	
	@Test
	public void testArea() {
		testeQ.construtor(5.0);
		assertTrue(testeQ.area() == 25);	
	}
	
	@Test
	public void testPerimetro() {
		testeQ.construtor(5.0);
		assertTrue(testeQ.perimetro() == 20);	
	}

}
