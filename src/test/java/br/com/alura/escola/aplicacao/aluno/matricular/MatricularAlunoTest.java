package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunos repository = new RepositorioDeAlunoEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repository);
		useCase.executa(new MatricularAlunoDTO("Geovan", "392.321.028-03", "geovansilvagoes@gmail.com"));
		Aluno aluno = repository.buscarPorCPF(new CPF("392.321.028-03"));
		assertNotNull(aluno);
	}

}
