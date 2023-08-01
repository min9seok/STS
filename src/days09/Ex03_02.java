package days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author minseok
 * @date 2023. 7. 25. - 오전 11:05:47
 * @subject
 * @content
 */
public class Ex03_02 {
	
	public static void main(String[] args) {
		// [ 주민등록번호 ]
//		2. 생년월일 , 나이 , 성별 , 내국인/외국인 , 검증번호 ,  
		String rrn = "990123-1700001";
		int age = 0;
		// 주민등록번호 > 나이
		// 세는나이 CountinaAge
		age = getCountinaAge(rrn);
		System.out.println("> 세는 나이 : " + age);
		// 만나이  AmericanAge
		age = getAmericanAge(rrn);
		System.out.println("> 만 나이 : " + age);

		
	}//main

	public static int getAmericanAge(String rrn) {
		//생일이 오늘날짜 지남 여부 체크
		// 생일이 지나지 않았다면 -1
		// 만나이 = 올해년도 - 생일년도     -1(O,X)		
//		오늘-생일 >=0?0:-1
		int birthMMDD = Integer.parseInt(Ex03.getBirth(rrn).substring(4,9).replace(".",""));
		System.out.println(birthMMDD);
//		[1] Calendar 클래스 사용 월/일
		Calendar c = Calendar.getInstance();
		int thisMonth = c.get(Calendar.MONTH);
		int thisDay = c.get(Calendar.DATE);
		int thisMMDD = thisMonth * 100 + thisDay;
//		[2] Date 클래스 사용 월/일
//		Date d = new Date();
//		int thisMonth = d.getMonth()+1;
//		int thisDay = d.getDate();
//		int thisMMDD = thisMonth * 100 + thisDay;
//		[3] SimpleDateFormat
//		Date d = new Date();
//		String pattern = "MMdd";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		int thisMMDD = Integer.parseInt(sdf.format(d));
		
		boolean flag = thisMMDD - birthMMDD >= 0;				
		int AmericanAge = getCountinaAge(rrn)-1 + (flag?0:-1);
		return AmericanAge;
	}

	public static int getCountinaAge(String rrn) {		
		//올해 2023년도
		Date d = new Date();
//		int thisYear = d.getYear() + 1900;		
		Calendar c = Calendar.getInstance();		
		int thisYear = c.get(Calendar.YEAR);
		
		//생일 1999년도		
		int birthYear = Integer.parseInt(Ex03.getBirth(rrn).substring(0,4));
		
		// 세는나이 = 올해 - 생일 +1
		int countinaAge = thisYear - birthYear +1;						
		return countinaAge;
	}

}
