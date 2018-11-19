package br.com.jonatas.pessoa;

import br.com.jonatas.pessoa.interfaces.Autentica;

public class Autenticador implements Autentica {
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
