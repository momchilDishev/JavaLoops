package _03_JavaLoopsHomework;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _07_DaysBetweenDates {

	public static void main(String[] args) {
		Scanner dateScan = new Scanner(System.in);
		String firstDate = dateScan.nextLine();	
		String secondDate = dateScan.nextLine();
		
		LocalDate start = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("d-MM-uuuu"));
        LocalDate end = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern("d-MM-uuuu"));
		long days = ChronoUnit.DAYS.between(start, end);
		System.out.println(days);
	}

}
