package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.FabricaDeAluno;

public class MatricularAlunoDTO {
	
	private String nome;
	private String cpf;
	private String email;
	public MatricularAlunoDTO(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public Aluno parse() {
		return new FabricaDeAluno().comNomeCPFEmail(this.nome, this.cpf, this.email).build();
	}
}
