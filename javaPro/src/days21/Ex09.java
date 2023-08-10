package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

public class Ex09 {

	public static void main(String[] args) {
		// TemporalAdjusters 
		// 날짜,시간 수정시 with,plus,minus
		// 자주 사용되는 날짜, 시간 변경하는 메서드를 미리 구현한 클래스
		// 예) 다음 년(달) 첫 날 
		//    올해 첫 날
		//    이번 달 첫 날
		//    올해 마지막 날
		//    이번 달 마지막 날 lastDayOfMonth()
		//    다음 주 ?요일
		//    지난 주 ?요일
		//    이번 달 n번째 ?요일 등등

		LocalDate d = LocalDate.now();
		System.out.println(d);
		// 다음 달 첫 날
		System.out.println(d.with(firstDayOfNextMonth()));
		// 이번 달 첫 날
		System.out.println(d.with(firstDayOfMonth()));
		// 이번 달 첫 번쨰 월요일
		System.out.println(d.with(TemporalAdjusters.firstInMonth(MONDAY)));
		// 지난 주 화요일
		System.out.println(d.with(TemporalAdjusters.previous(THURSDAY)));
		// OrSame 오늘 포함
		System.out.println(d.with(TemporalAdjusters.previousOrSame(THURSDAY)));
		
		// 다음 주 금요일 휴강
		System.out.println(d.with(next(FRIDAY)));
		// OrSame 오늘 포함
		System.out.println(d.with(nextOrSame(FRIDAY)));
		
		// 이번 달 네 번째 화요일
		System.out.println(d.with(dayOfWeekInMonth(4, TUESDAY)));
		
		// 3일 뒤 
//		d = d.plusDays(3);
		d = d.with(new DayAfter3일());
		System.out.println(d);
	}//main
}//class

class DayAfter3일 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {		
		return temporal.plus(3,ChronoUnit.DAYS);
	}
	
}







