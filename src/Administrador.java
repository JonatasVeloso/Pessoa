
public class Administrador extends Funcionario implements Autentica{
	
	private int senha;
	@Override
	public void getBonificaacao() {
		
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}