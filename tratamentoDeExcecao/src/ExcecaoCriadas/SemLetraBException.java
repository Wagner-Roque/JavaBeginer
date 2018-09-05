package ExcecaoCriadas;

public class SemLetraBException extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Não existe letra B em sua Frase";
	}
}
