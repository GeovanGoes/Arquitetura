package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDevePermitirTelefonesInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "1234567"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "1234567"));
	}
	
	void devePermitirTelefonesValidos() {
		assertDoesNotThrow(() -> new Telefone("11", "989765432"));
	}

}
