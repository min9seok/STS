package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex04 {

	public static void main(String[] args) {
		// jdk 1.1 Calendar 추상클래스 - 날짜 시간
//		Calendar c = new Calendar(); 객체생성X 
//		Calendar c = new GregorianCalendar();
//			               ㄴ    BuddhistCalendar 태국
		Calendar c = Calendar.getInstance();
//		c.add(int 날짜값, 증감값);
//		c.clear(시간); == date.steHours(0);		
		//년
//		System.out.println(c.getWeekYear());		
		System.out.println(c.get(1));
//		System.out.println(c.get(Calendar.YEAR));
		//월
		System.out.println(c.get(2)+1);
//		System.out.println(c.get(Calendar.MONTH)+1);
		//일
		System.out.println(c.get(5));
//		System.out.println(c.get(Calendar.DATE));
		//시간
		System.out.println(c.get(10));
//		System.out.println(c.get(Calendar.HOUR)); // 12(0~11)
//		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 24(0~23)
		//분
		System.out.println(c.get(12));
//		System.out.println(c.get(Calendar.MINUTE));
		//초
		System.out.println(c.get(13));
//		System.out.println(c.get(Calendar.SECOND));
		//밀리초
		System.out.println(c.get(14));
//		System.out.println(c.get(Calendar.MILLISECOND));
		//요일
		System.out.println("일월화수목금토".charAt(c.get(7)));
//		System.out.println("일월화수목금토".charAt(c.get(Calendar.DAY_OF_WEEK)));
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.AM_PM));
		
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 221
		// 해당 월의 몇 번째 주
		System.out.println(c.get(Calendar.WEEK_OF_MONTH)); 
		// 해당 년의 몇 번째 주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR)); 
		
	}//main

}//class
