package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoEvento;

public class LogDeAlunoMatriculado extends Ouvinte {
	
	public void reageAo(Evento evento) {
		System.out.println(String.format("Aluno com o CPF %s matriculado em: %s", ((AlunoMatriculado) evento).getCpfDoAluno(), evento.momento()));
	}
	
	@Override
	protected boolean deveProcessar(Evento evento) {
		if (evento.tipo().equals(TipoEvento.ALUNO_MATRICULADO))
			return true;
		return false;
	}

}
