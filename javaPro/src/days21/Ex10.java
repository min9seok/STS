package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex10 {

	public static void main(String[] args) {
		
		// Period = 날짜 - 날짜
		// Duration = 시간 - 시간
		
		// between() == until()
		// static       인스턴스
		
		// of(), with() 변경
		// plus(), minus() 등등
		
		/* Period
		LocalDate s = LocalDate.of(2023, 7, 13);
		LocalDate t = LocalDate.now();
		t = t.plusDays(1);
		
		Period p = Period.between(s, t);
		int year = p.getYears();		
		System.out.println(year);

		long month = p.get(ChronoUnit.MONTHS);
		System.out.println(month);
		
		int day = p.getDays();
		System.out.println(day);
		*/
		
		LocalTime st = LocalTime.of(9,0,0);
		LocalTime tt = LocalTime.now();
		
		Duration d = Duration.between(st, tt);
		
		long ss = d.getSeconds();
//		System.out.println(ss); // 초
//		System.out.println(ss/60); // 분		
//		System.out.println(ss/(60*60)); // 시간
		
		//UnsupportedTemporalTypeException
//		long h = d.get(ChronoUnit.HOURS);
//		System.out.println(h);
		
	}//main

}//class
