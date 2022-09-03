package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEmailInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email("jovam.gmaiu"));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
	}
	
	@Test
	void deveAceitarEmailValido() {
		assertDoesNotThrow(() -> new Email("geovansilvagoes@gmail.com"));
	}

}
