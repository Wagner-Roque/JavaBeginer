import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExemploDeLeitura {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe o nome de arquivo texto: \n");
		String nome = ler.nextLine();

		System.out.printf("\nConteúdo do arquivo texto: \n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();
			// lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			while (linha != null) {
				System.out.printf("%s\n", linha);
				linha = lerArq.readLine();// lê a segunda linha até a última linhas
			}
			arq.close();
		} catch (IOException e) {
			System.out.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
		System.out.println();
	}

}
