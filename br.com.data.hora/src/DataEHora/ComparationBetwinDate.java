package DataEHora;

import java.time.LocalDate;
import java.time.Period;

public class ComparationBetwinDate {
	public static void main(String[] args) {
		//Compara e mostra qual é a data mais antiga
		LocalDate localDateAntigo = LocalDate.of(2018, 12, 9);
		LocalDate localDateNovo = LocalDate.of(2000, 9, 7);
		
		System.out.println(localDateAntigo.isAfter(localDateNovo));
		System.out.println(localDateAntigo.isBefore(localDateNovo));
		System.out.println(localDateAntigo.isEqual(localDateNovo));
		
		Period periodo = Period.between(localDateAntigo, localDateNovo);
		System.out.println(periodo.getYears() + " Anos "+ periodo.getMonths() + " Mês " + periodo.getDays() + " Dias");
		System.out.println("Apenas meses: " + periodo.toTotalMonths());
	}
}
