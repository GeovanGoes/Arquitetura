package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.FabricaDeAluno;

class FabricaDeAlunoTest {

	@Test
	void naoDeveriaPermitirMaisDeDoisTelefones() {
		assertThrows(RuntimeException.class, () -> new FabricaDeAluno().comNomeCPFEmail("Geovan Goes", "392.321.028-03", "geovansilvagoes@gmail.com")
				.comTelefone("11", "58444358")
				.comTelefone("11", "989762229")
				.comTelefone("11", "37735304")
				.build()); 
	}
	
	@Test
	void deveriaPermitirDoisTelefones() {
		assertDoesNotThrow(() -> new FabricaDeAluno().comNomeCPFEmail("Geovan Goes", "392.321.028-03", "geovansilvagoes@gmail.com")
				.comTelefone("11", "58444358")
				.comTelefone("11", "989762229")
				.build()); 
	}

}
