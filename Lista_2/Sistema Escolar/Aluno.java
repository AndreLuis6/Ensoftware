package andre.uespi.prp.br;

public class Aluno {
	String nome;
	int matricula;
	int idade;
	
	void contrutor(String nome, int matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}
	
	String setNomeAluno() {
		return nome;
	}
	
	int setMatAluno() {
		return matricula;
	}
	
	int setIdadeAluno() {
		return idade;
	}

}