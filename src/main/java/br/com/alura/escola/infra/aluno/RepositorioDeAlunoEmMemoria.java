package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEcontrado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunoEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return matriculados.stream().filter(aluno -> aluno.getCpf().equals(cpf.getNumero())).findFirst().orElseThrow(() -> new AlunoNaoEcontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
