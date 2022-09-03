package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularUmAluno {
	
	
	public static void main(String[] args) {
		
		MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunoEmMemoria());
		
		String nome = "Geovan Goes";
		String cpf = "392.321.028-03";
		String email = "geovansilvagoes@gmail.com";
		
		matricularAluno.executa(new MatricularAlunoDTO(nome, cpf, email));
	}
}
