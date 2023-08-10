package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex06 {

	public static void main(String[] args) {
		
		LocalTime t = LocalTime.now();
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		System.out.println(t.getNano());
		// 밀리세컨드		
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
		
		//
//		t = t.plusMinutes(30);
//		t = t.minusMinutes(10);
		
//		[1]
//		t = t.plusHours(1);
//		t = t.plusMinutes(30);
//		[2]	
		t = t.plusMinutes(90);
		
		System.out.println(t);
		
		

	}//main

}//class
