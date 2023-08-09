package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author user
 * 형식화 클래스
 *  Decimal
 *   format() 숫자 > 원하는 형식의 문자열
 *   parse()  문자열 > 숫자
 *  
 *  SimpleDate
 *   format() 날짜 > 원하는 형식의 문자열
 *   parse() 문자열 > 날짜
 */
public class Ex08 {

	public static void main(String[] args) {
//		23년 8월 9일 "수요일"
//		날짜로 변환하는 코딩
		String strDate = "23년 8월 9일 (수요일)";
		String pattern = "yy년 MM월 dd일 (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d = sdf.parse(strDate);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			System.out.println(Ex05.getPatternDate(c, pattern));
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
//		[1] 내 코딩
//		Date d = new Date();
//		Calendar c = Calendar.getInstance();
//		String pattern = "yy년 MM월 dd일 (E요일)";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		d = c.getTime();
//		String s = sdf.format(d);		
//		System.out.println(s);
		
		
		
		
		
		
		
		

	}//main

}//class
