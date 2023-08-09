package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11_02 {

	public static void main(String[] args) {
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // 2023-08-09
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt); // 15:49:03.299071700
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2023-08-09T15:49:42.904309100
		 */
		
		LocalDate ld = LocalDate.of(2015, 11, 23);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(3, 20, 11);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);		
		
	}//main
}//calss

