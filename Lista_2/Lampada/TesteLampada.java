package andre.uespi.prp.br;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TesteLampada {
	Lampada testeL = new Lampada();
	
	@Test
	public void testeLampLiga() {
		testeL.liga();
		assertTrue(testeL.ligada == true);
		}
	
	@Test
	public void testeLampDesliga() {
		testeL.desliga();
		assertTrue(testeL.ligada == false);
		}

}
