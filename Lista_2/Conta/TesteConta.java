package andre.uespi.prp.br;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteConta {
	Conta testC = new Conta();
	
	@Test
	public void testeDeposito() {
		testC.saldo = 100;
		testC.deposita(100);
		assertTrue(testC.saldo == 200);

	}
	
	@Test
	public void testeSaque() {
		testC.saldo = 100;
		testC.sacar(50);
		assertTrue(testC.saldo == 50);

	}
	
	@Test
	public void testeRendimento() {
		testC.saldo = 100;
		assertTrue(testC.CalculaRendimento() == 10);

	}

}
