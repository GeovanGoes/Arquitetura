package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalario(Funcionario funcionario, Reajuste reajuste) {
		validacoes.forEach(validacao -> validacao.validar(funcionario, reajuste));
		BigDecimal salario = funcionario.getDadosPessoais().getSalario().add(reajuste.valor());
		funcionario.atualizarSalario(salario);
	}

	

}
