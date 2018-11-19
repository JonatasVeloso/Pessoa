package br.com.jonatas.pessoa.objetos;
import br.com.jonatas.pessoa.Autenticador;
import br.com.jonatas.pessoa.interfaces.Autentica;

public class Administrador extends Funcionario implements Autentica{
	
	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	
	@Override
	public void getBonificaacao() {
		
	}
	
}
