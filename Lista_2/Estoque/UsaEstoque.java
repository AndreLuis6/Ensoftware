package andre.uespi.prp.br;

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque();
		Estoque estoque2 = new Estoque();
		Estoque estoque3 = new Estoque();
		
		estoque1.mudarNome(" Impressora Jato de Tinta");
		estoque1.repor(13);
		estoque1.mudarQtdMinima(6);
		estoque1.darBaixa(5);
		System.out.println(estoque1.mostra());
		System.out.println("| Precisa repor? " + estoque1.precisaRepor());
		
		estoque2.mudarNome("  Monitor LCD 17 polegadas");
		estoque2.repor(11);
		estoque2.mudarQtdMinima(13);
		estoque2.repor(7);
		System.out.println(estoque2.mostra());
		System.out.println("| Precisa repor? " + estoque2.precisaRepor());
		
		estoque3.mudarNome(" Mouse Ótico");
		estoque3.repor(6);
		estoque3.mudarQtdMinima(6);
		estoque3.darBaixa(4);
		System.out.println(estoque3.mostra());
		System.out.println("| Precisa repor? " + estoque3.precisaRepor());
	}

}
