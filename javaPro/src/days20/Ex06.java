package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author user
 * add() / set() / roll() 차이점
 * - add()는 특정 필드의 값을 증가 또는 감소 (다른 필드에 영향 O) 
 * - set()으로 날짜와 시간 지정하기
 * - roll()은 특정 필드의 값을 증가 또는 감소 (다른 필드에 영향 X) 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 2023. 8 달력
		Calendar c = new GregorianCalendar(2023,8-1,1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek+1);
//		c.add(Calendar.MONTH, 1);
		
		System.out.println(Ex05.getPatternDate(c,"yyyy-MM-dd"));
	}//main

}//class
