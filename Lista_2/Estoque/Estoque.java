package andre.uespi.prp.br;

public class Estoque {
	String nome;
	int qtdMinima;
	int qtdAtual;

	void CriaEstoque() {

	}

	void CriaEstoque(String nome, int qtdMinima, int qtdAtual) {
		

	}

	void mudarNome(String nome) {
		this.nome = nome;
	}

	void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	void repor(int qtd) {
		this.qtdAtual = this.qtdAtual + qtd;
	}
	
	void darBaixa(int qtd) {
		this.qtdAtual = this.qtdAtual - qtd;
	}
	
	String mostra() {
		return "nome: " + nome + ", Quantidade: " + qtdAtual + ", Quantidade minima: " + qtdMinima;
	}
	
	Boolean precisaRepor() {
		if(qtdMinima >= qtdAtual) return true;
		else return false;
	}
}