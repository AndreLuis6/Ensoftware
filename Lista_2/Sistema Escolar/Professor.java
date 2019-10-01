package andre.uespi.prp.br;

public class Professor {
	String nome;
	int matricula;
	String turma;
	
	void contrutor(String nome, int matricula, String turma) {
		this.nome = nome;
		this.matricula = matricula;
		this.turma = turma;
	}
	
	String setNomeProfessor() {
		return nome;
	}
	
	int setMatProfessor() {
		return matricula;
	}
	
	String setTurmaProfessor() {
		return turma;
	}
	

}
