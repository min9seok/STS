package days21;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		// 이번 달이 마지막 날짜 몇 일까지?
		// 1. Date
//		Date date = new Date();
//		date.setMonth(date.getMonth()+1);
//		date.setDate(1);
//		date.setDate(0);
		// 2. Calendar
		// 3. LocalDate
//		String source = "2009년 12월 30일";
//		String source = "2009-12-30";
//		LocalDate ld = LocalDate.parse(source);
//		System.out.println(ld);
		
//		[1]
//		LocalDate ld = LocalDate.now();
//		//해당 월의 첫째 날
//		LocalDate fD = ld.withDayOfMonth(1);                     // 2023-05-01
//		System.out.println(fD);
//		//해당 월의 마지막 날
//		LocalDate lD = ld.withDayOfMonth(ld.lengthOfMonth());   // 2023-05-31
//		System.out.println(lD);
		
//		[2]
		LocalDate today = LocalDate.now();
		today = today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(today);
		
		//TemporalAdjuster
		
		
		
		
		
		
		
	}//main
}//class
