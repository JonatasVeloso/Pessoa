package br.com.jonatas.pessoa;

import br.com.jonatas.pessoa.interfaces.Autentica;

public class SistemaInterno {
	private int senha = 2222;

	public void autentica(Autentica a) {
		boolean autenticou = a.autentica(senha);

		if (autenticou) {
			System.out.println("Usuário autorizado!");
		} else {
			System.out.println("Usuário Não autorizado!");
		}
	}

}
