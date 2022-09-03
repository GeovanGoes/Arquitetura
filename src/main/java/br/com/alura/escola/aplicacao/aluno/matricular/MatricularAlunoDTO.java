package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;

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
