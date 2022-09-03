package br.com.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.escola.shared.dominio.CPF;

public class Aluno {
	
	private CPF cpf;
	
	private String nome;
	
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;
	
	
	public Aluno(CPF cpf, String nome, Email email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		if (this.telefones.size() == 2)
			throw new RuntimeException("Numero máximo de telefones atingido.");
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public String getCpf() {
		return cpf.getNumero();
	}
	
	public CPF getCpfWrapper() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		List<Telefone> result = Collections.emptyList();
		result.addAll(this.telefones);
		return result;
	}
	public String getSenha() {
		return senha;
	}
}
