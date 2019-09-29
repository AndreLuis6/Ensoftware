package andre.uespi.prp.br;

public class UsaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular="Enzo";
		c1.agencia="2411";
		c1.numero=5843643;
		c1.DataAbertura="26/06/2015";
		c1.saldo=1054;
		System.out.println(c1.recuperaDadosParaImpressao());

	}

}
