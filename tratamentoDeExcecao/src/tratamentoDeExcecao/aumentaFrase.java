package tratamentoDeExcecao;

public class aumentaFrase extends TesteString {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			aumentarLetras();
		} catch (Exception e) {
			System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras() " +e);
		}

	}
}
