package days21;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/*

2. String source = "2023/08/10 (목) 12:23:01"
문자열 source를 Calendar 객체로 변환해 
"2023년 8월 10일 (목)"으로 출력하는 코딩을 하세요 .
  
 */
public class Ex01 {

	public static void main(String[] args) throws ParseException {
		
		String source = "2023/08/10 (목) 12:23:01";
		String pattern = "yyyy/MM/dd (E) hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = sdf.parse(source);
		System.out.println(d.toLocaleString());
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		d = c.getTime();
		pattern = "yyyy년 M월 d일 (E)";
		sdf = new SimpleDateFormat(pattern);
		String strd = sdf.format(d);
		System.out.println(strd);
	
		
		
	}//main

}//class
