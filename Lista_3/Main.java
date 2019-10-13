package andre;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*Conta c1 = new Conta("Zezé", 4002, 150);
		Conta c2 = new Conta("Valdir", 9543, 3050);
		c1.saca(1500);
		c1.deposita(500);
		c2.saca(500);
		c1.getSaldo();
		c2.getSaldo();
		c1.transferir(c2, c1, 1000);
		c1.transferir(c1, c2, 1500);
		c1.imprimir();
		c2.imprimir();
		c1.setNome("Zezé");
		c1.imprimir();*/
		
		
		/*Pessoa pess = new Pessoa();
		pess.setNome("Andre");
		pess.setIdade(20);
		pess.setAltura(1.74);
		pess.setPeso(60);
		System.out.println(pess.getNome());
		System.out.println(pess.getIdade());
		System.out.println(pess.getAltura());
		System.out.println(pess.getPeso());
		pess.imc();
		pess.imprimir();*/
		
		
		Produto pro=new Produto();
		pro.setPrecoCusto(30);
		pro.setPrecoVenda(40);
		pro.calcularMargemLucro();
		pro.getMargemLucroPorcentagem();
		
		
		ArrayList<Funcionario> administrativo = new ArrayList();
		ArrayList<Funcionario> empressarial = new ArrayList();
		ArrayList<Funcionario> executivo = new ArrayList();
		ArrayList<Funcionario> todoFuncionarios = new ArrayList();

		Funcionario f1 = new Funcionario("def1", "dhjshdsahs", TipoFuncionario.EXECUTIVO);
		executivo.add(0, f1);
		todoFuncionarios.add(0, f1);
		Funcionario f2 = new Funcionario("def2", "sgdsgdsghjd", TipoFuncionario.EMPRESSARIAL);
		empressarial.add(0, f2);
		todoFuncionarios.add(1, f2);
		Funcionario f3 = new Funcionario("def3", "dshdhsdsgjdg", TipoFuncionario.ADIMINISTRATIVO);
		administrativo.add(0, f3);
		todoFuncionarios.add(2, f3);
	}

}
