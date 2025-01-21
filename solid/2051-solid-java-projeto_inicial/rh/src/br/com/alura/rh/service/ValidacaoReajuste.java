package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {
	void validar(Funcionario funcionario, Reajuste reajuste);
}
