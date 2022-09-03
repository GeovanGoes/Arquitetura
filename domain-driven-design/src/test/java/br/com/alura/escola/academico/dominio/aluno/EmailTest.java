package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

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
