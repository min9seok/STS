package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06_02 {

	public static void main(String[] args) {
		// 2023. 8 
		Calendar c = new GregorianCalendar(2023,8-1,1);
		// 하루 전
//		c.set(Calendar.DATE,0);
//		c.set(Calendar.DATE,10);
//		c.set(Calendar.DATE,32);
		
//		c.add(Calendar.DATE,-1); c 날짜 -1 -- 7.31 
//		c.add(Calendar.DATE,1); c 날자 +1 -- 8.1
		
//		c.roll(Calendar.DATE,-1); c date -1 -- 8.31 
//		c.roll(Calendar.DATE,-1); c date +1 -- 8.1
		
				
		System.out.println(Ex05.getPatternDate(c,"yyyy-MM-dd"));
	}//main

}//class
