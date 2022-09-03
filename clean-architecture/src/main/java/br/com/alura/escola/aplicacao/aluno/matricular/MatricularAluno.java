package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

//Command
public class MatricularAluno {

	private RepositorioDeAlunos repository;
	
	public MatricularAluno(RepositorioDeAlunos repository) {
		this.repository = repository;
	}
	
	public void executa (MatricularAlunoDTO dto) {
		Aluno novo = dto.parse();
		repository.matricular(novo);
	}
	
}
