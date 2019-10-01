package andre.uespi.prp.br;

public class Turma {
	String nome;
	String disciplina;
	String professor;
	
	void construtor(String nome, String disciplina, String professor) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.professor = professor;
	}
	
	String setNomeTurma() {
		return nome;
	}
	
	String setDisciplinaTurma() {
		return disciplina;
	}
	
	String setProfTurma() {
		return professor;
	}

}
