package andre.uespi.prp.br;

public class Disciplinas {
	int codigo;
	String professor;
	String nome;
	
	void contrutor(int codigo, String professor, String nome) {
		this.codigo = codigo;
		this.professor = professor;
		this.nome = nome;
	}
	
	int setCodDisciplina() {
		return codigo;
	}

	String setProfDisciplina() {
		return professor;
	}
	
	String setNomeDisciplina() {
		return nome;
	}
}
