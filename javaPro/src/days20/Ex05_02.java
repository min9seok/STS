package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author user
 * 날짜 시간 정보를 사용자가 원하는 형식 출력
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
//		SimpleDateFormat  형식화 클래스
		String pattern = "yyyy. MM. dd. a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
//		 Date 클래스 이용
//		Date today = new Date();
//		String strToday = sdf.format(today);
//		//2023. 08. 09. 오후 12:18:21
//		System.out.println(strToday);
		
		Calendar c = Calendar.getInstance();
		// Calendar > Date 형 변환	
//		[1]
//		Date today = new Date(c.getTimeInMillis());
//		[2]
		Date today = c.getTime();
		String strToday = sdf.format(today);
		System.out.println(strToday);
	}//main

}//class
