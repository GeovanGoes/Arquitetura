package br.com.alura.escola.infra.aluno;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunoComJPA implements RepositorioDeAlunos {

	//injetar o repository jpa aqui e usar ele
	
	
	@Override
	public void matricular(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
