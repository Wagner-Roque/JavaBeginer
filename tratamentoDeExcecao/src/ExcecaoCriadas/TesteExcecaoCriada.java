package ExcecaoCriadas;

public class TesteExcecaoCriada {
	public static void main(String[] args) throws SemLetraBException {
		String frase = "Sou um Teste para a Letra b";
		if (!frase.contains("b") || !frase.contains("B")) {
			throw new SemLetraBException();
		}else {
			System.out.println("Existe letra b ou B");
		}
	}
}
