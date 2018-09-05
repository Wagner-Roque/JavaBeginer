package DataEHora;

import java.time.Duration;
import java.time.Instant;

public class MostraDuracao {
	public static void main(String[] args) {
		//Mostra o tempo de execu��o de um modo mais elegante
				Instant iInicial = Instant.now();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Instant iFinal = Instant.now();
				Duration duracao = Duration.between(iInicial, iFinal);

				System.out.println("**********************");

				System.out.println("Dura��o em nanos segundos: "+ duracao.toNanos());
				System.out.println("Dura��o em minutos: " +duracao.toMinutes());
				System.out.println("Dura��o em horas: "+ duracao.toHours());
				System.out.println("Dura��o em milessegundos: " + duracao.toMillis());
				System.out.println("Dura��o em dias: " + duracao.toDays());
				
				//Mostra o tempo de execu��o do programa
				long instanteInicial = System.currentTimeMillis();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				long instanteFinal = System.currentTimeMillis();
				long duracaoEmMilesegundos = instanteFinal - instanteInicial;
				System.out.println("Dura��o em segundos: " + (duracaoEmMilesegundos /1000) % 60);
				
	}
}
