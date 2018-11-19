package br.com.jonatas.pessoa.interfaces;

public interface Autentica {
	
	public abstract void setSenha(int senha);
	public boolean autentica(int senha);
}
