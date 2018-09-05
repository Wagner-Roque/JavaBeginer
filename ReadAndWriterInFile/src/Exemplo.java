import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int i, n;

		System.out.println("Informe o n�mero para a tabuada: \n");
		n= ler.nextInt();

		FileWriter arq = new FileWriter("C:\\write\\multiplicacao.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf(" + --- Resultado ---+%n");
		for ( i = 0; i <= 10 ; i++) {
			gravarArq.printf("| %2d X %2d = %2d |%n", i, n, (i*n));

		}
		gravarArq.printf("+----------------------+%n");
		arq.close();
		System.out.printf("\nTabuada do %d foi gravada com sucesso em \"c:\\multiplicacao.txt\".\n",n);
	}
	
}
