package br.com.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

	private List<Selo> selos = new ArrayList<>();
	
	
	@Override
	public List<Selo> selosDoAluno(CPF cpf) {
		return selos.stream().filter(selo -> selo.getCpfDoAluno().equals(cpf)).collect(Collectors.toList());
	}

	@Override
	public void adicionar(Selo selo) {
		selos.add(selo);
	}

}
