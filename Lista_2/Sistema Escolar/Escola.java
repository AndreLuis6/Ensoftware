package andre.uespi.prp.br;

public class Escola {

	public static void main(String[] args) {
		Aluno novoAluno = new Aluno();
		Professor novoProfessor = new Professor();
		Disciplinas novaDiciplina = new Disciplinas();
		Turma novaTurma = new Turma();
		
		novoAluno.contrutor("Messi", 1201, 15);
		novoProfessor.contrutor("Pele", 1000, "A3");
		novaDiciplina.contrutor(5467, "Ari", "Redes");
		novaTurma.construtor("D5", "Programção", "Ian");
		
		System.out.println("Aluno: " + novoAluno.setNomeAluno()+ "| Maricula" + novoAluno.setMatAluno() + "| Idade: " + novoAluno.setIdadeAluno());
		System.out.println("Professor: " + novoProfessor.setNomeProfessor() + "| Matricula: " + novoProfessor.setMatProfessor() + "| Turma: " + novoProfessor.setTurmaProfessor());
		System.out.println("Nome: " + novaDiciplina.setNomeDisciplina() + "| Codigo: " + novaDiciplina.setCodDisciplina() + "| Porofessor: " + novaDiciplina.setNomeDisciplina());
		System.out.println("Nome: " + novaTurma.setNomeTurma() + "| Disciplina: " + novaTurma.setDisciplinaTurma() + "| Professor: " + novaTurma.setProfTurma());

	}

}
