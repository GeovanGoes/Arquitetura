package br.com.alura.escola.academico.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.alura.escola.academico.dominio.aluno.Aluno;

public class Indicacao {
	
	private Aluno indicado;
	
	private Aluno indicante;
	
	private LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno indicado, Aluno indicante) {
		super();
		this.indicado = indicado;
		this.indicante = indicante;
		dataIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return indicado;
	}
	
	public Aluno getIndicante() {
		return indicante;
	}
	
	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
}
