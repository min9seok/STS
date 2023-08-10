package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex07 {

	public static void main(String[] args) {
		/*
		LocalDateTime dt = LocalDateTime.now();
		//2023-08-10T11:19:42.642432200
		System.out.println(dt);
		
		// truncate 절삭(내림)
//		dt = dt.truncatedTo(ChronoUnit.HOURS);
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
		*/
		
		/*
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		LocalDateTime dt = LocalDateTime.of(d, t);
		
		LocalDateTime dt2 = d.atTime(t);
		
		LocalDateTime dt3 =	t.atDate(d);
		 */
		
		LocalDateTime dt = LocalDateTime.now();
//		LocalDateTime > LocalDate 변환
		LocalDate ld = dt.toLocalDate();
		System.out.println(ld);
//		LocalDateTime > LocalTime 변환
		LocalTime lt = dt.toLocalTime();
		System.out.println(lt);
	}//main
}//class
