package DataEHora;

import java.time.LocalDate;

public class ManipulacaoDeDatas {
	//Manipula a data incluindo ou removendo datas passadas como
	//par�metro
	public static void main(String[] args) {
		LocalDate dataManipulacao = LocalDate.now();
		System.out.println("Mais 5 dias:" + dataManipulacao.plusDays(5));
		System.out.println("Mais 5 semanas:" + dataManipulacao.plusWeeks(5));
		System.out.println("Mais 5 anos:" + dataManipulacao.plusYears(5));
		System.out.println("Mais 2 meses:" + dataManipulacao.plusMonths(2));
		System.out.println("Menos 1 ano:" + dataManipulacao.minusYears(1));
		System.out.println("Menos 1 m�s:" + dataManipulacao.minusMonths(1)); 
		System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));
		System.out.println("Data Original:" + dataManipulacao);
	}
}
