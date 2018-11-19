
public class TesteSistema {
	
	
	public static void main(String[] args) {
		Autentica g = new Gerente();
		g.setSenha(2222);
		
		Autentica a = new Administrador();
		a.setSenha(2222);
		
		Cliente c = new Cliente();
		c.setSenha(1212);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		si.autentica(a);
		si.autentica(c);
			
	}
}
