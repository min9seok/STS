package days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class Ex13 {

	public static void main(String[] args) {
		// 불변
		LocalDate d = LocalDate.now();
		System.out.println(d); 
		
		//withXXX()
//		 d = d.withYear(2020);
//		 d = d.withMonth(5);
//		 d = d.withDayOfMonth(11);

		d = d.with(ChronoField.YEAR,2010);
		d = d.with(ChronoField.MONTH_OF_YEAR,5);
		d = d.with(ChronoField.DAY_OF_MONTH,11);
		System.out.println(d); 
	}//main
}//class
