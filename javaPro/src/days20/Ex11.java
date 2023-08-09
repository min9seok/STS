package days20;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 Date jdk1.0
		 Calendar jdk 1.1
		 jdk 1.8 새로 추가된 날짜,시간 클래스 java.time
		1. java.time 패키지 - 4개의 하위 패키지로 구성
		java.time.chrono : 표준(ISO) 이 아닌 달력 시스템을 위한 클래스 제공
		java.time.format : 형식화(파싱) 
		java.time.temporal(시간의) : 날짜,시간의 필드(field)와 단위(unit) 
		java.time.zone : time-zone(시간대)
	  				 
	  	2. java.time : 날짜, 시간 다루는 핵심 클래스
	  	1) 날짜 : LocalDate
	  	2) 시간 : LocalTime
	  	3) 날짜 + 시간 : LocalDateTime
	  	4) 날짜 + 시간 + 시간대 : ZoneDateTime
	  	
	  	Temporal, TemporalAdjuster 인터페이스 구현
	  	
	  	3. new 연산자로 객체 생성 X > now() , of() 메서드로 객체 생성
	  	
	  	4. 날짜와 날짜 사이의 간격 : Period
 	  	-- 시간과 시간 사이의 간격 : Duration 	  	
 	  	     TemporalAmount 인터페이스 구현
 	  	
 	  	5. 날짜와 시간의 [단위]를 정의해 놓은 것
 	  	    ㄴ Temporal[Unit] 인터페이스
 	  	    ㄴ Chrono[Unit] 클래스
 	  	
 	  	6. 년 월 일 등 날짜와 시간의 필드(field)를 정의해 놓은 것
 	  	    ㄴ Temporal[Field] 인터페이스
 	  	    ㄴ Chrono[Field] 클래스
 	  	    ex)Ex12.java
 	  	    
 	  	7. 특정 필드(년 월 일 시간 등등) 가져오기
 	  	    getXXX() : int getYear() 
 	  	    get(필드)
 	  	    
 	  	8. 특정 필드 수정 : with() plus() minus()
 	  	    1) Date d.setYear(????);
 	  	    2) Calendar c;
 	  	    	c.set(Calendar.YEAR,???)    roll() add() 
		*/
		
		
		
		
		
	}//main
}//class


