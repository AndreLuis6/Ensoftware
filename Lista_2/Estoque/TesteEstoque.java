package andre.uespi.prp.br;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteEstoque {
	Estoque teste = new Estoque();

	@Test
	public void testeQtdAtual() {
		teste.repor(30);
		assertTrue(teste.qtdAtual == 30);

	}

	@Test
	public void testeQtdMinima() {
		teste.mudarQtdMinima(10);
		assertTrue(teste.qtdMinima == 10);
	}

	@Test
	public void testeNome() {
		teste.mudarNome("TV");
		assertTrue(teste.nome.equals("TV"));
	}

}
