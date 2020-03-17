package br.com.srbarriga.utils.reports;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-08
 *
 */
public class LocalDateFormatter {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

	public String date() {
		return LocalDate.now().format(formatter);
	}

}
