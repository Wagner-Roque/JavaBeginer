package DataEHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class DataHoraAno {

	public static void main(String[] args) {
		//Mostrando a data e hora direto da m�quina
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("M�s: " + localDate.getMonthValue());
		System.out.println("M�s: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());

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

	}

}
