package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author user
 * DateTimeFormatter 형식화 
 */
public class Ex11 {

	public static void main(String[] args) {
		// java.time 패키지 핵심 클래스
		// 문자열 > 파싱 > 핵심클래스
		//      < 포멧 < 
		// DateTimeFormatter
		// LocalDateTime implements Temporal extends TemporalAccessor
		LocalDateTime dt = LocalDateTime.now(); 
		// 2023-08-10T14:05:46.948412200
		System.out.println(dt);
		
		// 2023/08/10 요일 시간:분:초:밀리세컨드
		String pattern = "yyyy/MM/dd E hh:mm:ss:SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		String output = dtf.format(dt);
		System.out.println(output);
	}//main
}//class
