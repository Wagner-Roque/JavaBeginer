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

		System.out.printf("\nConte�do do arquivo texto: \n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();
			// l� a primeira linha
			// a vari�vel "linha" recebe o valor "null" quando o processo
			// de repeti��o atingir o final do arquivo texto
			while (linha != null) {
				System.out.printf("%s\n", linha);
				linha = lerArq.readLine();// l� a segunda linha at� a �ltima linhas
			}
			arq.close();
		} catch (IOException e) {
			System.out.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
		System.out.println();
	}

}
