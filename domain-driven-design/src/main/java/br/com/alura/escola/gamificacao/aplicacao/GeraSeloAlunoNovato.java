package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

	private final RepositorioDeSelos reposity;
	
	public GeraSeloAlunoNovato(RepositorioDeSelos repository) {
		this.reposity = repository;
	}
	
	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo().equals(TipoEvento.ALUNO_MATRICULADO);
	}

	@Override
	protected void reageAo(Evento evento) {
		CPF cpf = (CPF)evento.informacoes().get("cpf");
		Selo novato = new Selo(cpf, "Novato");
		this.reposity.adicionar(novato);
	}
}
