package br.com.alura.rh.service;

import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidedeReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, Reajuste reajuste) {
		long meses = ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), reajuste.data());
		if (meses < 6) {
			throw new ValidacaoException("Intervalo entre reasjustes deve ser de pelo menos 6 meses.");
		}
	}
}
