package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

//Command
public class MatricularAluno {

	private RepositorioDeAlunos repository;
	
	private final PublicadorDeEventos publicador;
	
	public MatricularAluno(RepositorioDeAlunos repository, PublicadorDeEventos publicador) {
		this.repository = repository;
		this.publicador = publicador;
	}
	
	public void executa (MatricularAlunoDTO dto) {
		Aluno novo = dto.parse();
		repository.matricular(novo);
		publicador.publicarEvento(new AlunoMatriculado(novo.getCpfWrapper()));
	}
	
}
