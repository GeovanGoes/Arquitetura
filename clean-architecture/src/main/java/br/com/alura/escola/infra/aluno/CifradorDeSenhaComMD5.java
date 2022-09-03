package br.com.alura.escola.infra.aluno;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
		    md.update(senha.getBytes());
		    byte[] digest = md.digest();
		    StringBuffer sb = new StringBuffer();
		    for (byte b : digest)
		        sb.append(String.format("%02x", b & 0xff));
		    return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Erro ao gerar senha",e);
		}
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta) {
		return cifrarSenha(senhaAberta).equals(senhaCifrada);
	}

}
