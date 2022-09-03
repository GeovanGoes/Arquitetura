package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunoEmMemoria;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunos repository = new RepositorioDeAlunoEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repository, new PublicadorDeEventos());
		useCase.executa(new MatricularAlunoDTO("Geovan", "392.321.028-03", "geovansilvagoes@gmail.com"));
		Aluno aluno = repository.buscarPorCPF(new CPF("392.321.028-03"));
		assertNotNull(aluno);
	}

}
