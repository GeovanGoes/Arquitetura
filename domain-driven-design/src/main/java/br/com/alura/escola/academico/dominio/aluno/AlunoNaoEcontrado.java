package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

public class AlunoNaoEcontrado extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4612529851133390134L;

	public AlunoNaoEcontrado(CPF cpf) {
		super("Aluno nao encontrado com o CPF: " + cpf.getNumero());
	}
}
