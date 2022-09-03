package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDevePermitirCpfsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		assertThrows(IllegalArgumentException.class, () -> new CPF("1234567891"));
	}
	@Test
	void devePermitirCpfsValidos() {
		assertDoesNotThrow(() -> new CPF("123.456.789-01"));
	}

}
