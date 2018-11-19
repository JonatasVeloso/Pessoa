package br.com.jonatas.pessoa;

import br.com.jonatas.pessoa.interfaces.Autentica;
import br.com.jonatas.pessoa.objetos.Administrador;
import br.com.jonatas.pessoa.objetos.Cliente;
import br.com.jonatas.pessoa.objetos.Funcionario;
import br.com.jonatas.pessoa.objetos.Gerente;

public class TesteSistema {
	
	
	public static void main(String[] args) {
		Autentica g = new Gerente();
		g.setSenha(2222);
		
		//Autenticador a = new Administrador();
		//a.setSenha(2222);
		
		Cliente c = new Cliente();
		c.setSenha(1212);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		//si.autentica(a);
		si.autentica(c);
			
	}
}
