package days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(getLastDay(2023,7));

	}
	private static int getDayOfWeek(int year, int month, int day) {
		// 날짜,시간 기능(일,함수,메서드)구현된 클래스
		// java.utill.Date , Calendar
		// jdk1.8 LocalDate , LocalTime , LocalDateTime;
		LocalDate d = LocalDate.of(year, month, month);
		DayOfWeek w =   d.getDayOfWeek();
		// 1(월) 2(화) 3(수) 4(목) 5(금) 6(토) 7(일)
		
		return w.getValue() % 7 ;
	}
	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.of(1, 1, 1);
		LocalDate endDate = LocalDate.of(year, month, day);
		
		int totalDays = (int) startDate.until(endDate,ChronoUnit.DAYS) +1; //일수
//		startDate.until(endDate,ChronoUnit.MONTHS); //개월수
//		startDate.until(endDate,ChronoUnit.YEARS); //년수
		
		return totalDays;
	}
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year, month,1);
//		LocalDate lastDate = d.withDayOfMonth(d.lengthOfMonth()); //해당 월의 일			
		LocalDate lastDate = d.withDayOfMonth(month);		// 현재월
		return lastDate.getDayOfMonth();
	}
}
