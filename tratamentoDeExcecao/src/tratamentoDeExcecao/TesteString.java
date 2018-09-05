package tratamentoDeExcecao;

public class TesteString {
	protected static void aumentarLetras() throws Exception{
		String frase = null;
		String novaFrase = null;
		
		try {

			novaFrase = frase.toUpperCase();
			
		} catch (NullPointerException e) {
			throw new Exception(e);
		}
		
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
		
		
	}
	
}
