package days20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex12 {

	public static void main(String[] args) {
		
//		LocalDate d = LocalDate.now();
//		LocalDateTime d = LocalDateTime.of(2023,8,9,15,35);
		LocalDateTime d = LocalDateTime.now();
//		LocalDate d = LocalDate.ofYearDay(2023, 365);
//		System.out.println(d);
		
		//년		
		int year = d.getYear();
		System.out.println(year);
		year = d.get(ChronoField.YEAR);
		System.out.println(year);
		//월		
		Month emonth = d.getMonth();
		System.out.println(emonth);		
		int month = d.getMonthValue();
		System.out.println(month);
		month =d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		//일
		int day = d.getDayOfMonth();
		System.out.println(day);
		day = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		//시간
		int hour = d.get(ChronoField.HOUR_OF_DAY); // (밤12==0)~23		 
//	                   d.get(ChronoField.CLOCK_HOUR_OF_DAY); // 1~24(밤12==24)
//	                   d.get(ChronoField.HOUR_OF_AMPM); // 0~11
//	                   d.get(ChronoField.CLOCK_HOUR_OF_AMPM); // 1~12
		System.out.println(hour);
		//분
		int minute = d.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(minute);
		//초
		int second = d.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(second);
		//밀리초
		int millisecond = d.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(millisecond);
		int n = d.getNano();
		int no = d.get(ChronoField.NANO_OF_SECOND);
	    System.out.println( n );
	    System.out.println( no );
		//요일
		DayOfWeek edate = d.getDayOfWeek();
		System.out.println(edate);
		int date = d.get(ChronoField.DAY_OF_WEEK);
		 // Date      0(일)1(월)2(화)~6(토)
	      // Calendar  1(일)2(월)3(화)~7(토)
	      // LocalDate 1(월)2(화)~~~~ 6(토)7(일)
//		System.out.println(edate.getValue());
		System.out.println("일월화수목금토".charAt(date));
	}//main

}//class
