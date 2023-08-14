package days22;

import java.time.LocalDateTime;

public class Ex04 {

	public static void main(String[] args) {
//		4. java.time.LocalDateTime 클래스 사용
//		   1) 설문 시작일 : 23.8.10   9:00:00
//		   2) 설문 종료일 : 23.8.15  18:00:00
//		   
//		   지금 현재 설문 가능여부에 대해서 출력하세요.  ( 가능, 불가능 )
		LocalDateTime surveyStartDate = LocalDateTime.of(2023,8,10,9,00,00);
		LocalDateTime surveyEndDate = LocalDateTime.of(2023,8,15,18,00,00);
		LocalDateTime now = LocalDateTime.now();
		
//		now.isAfter();
//		now.isBefore();
//		now.isEqual();
//		now.compareTo(); 
		System.out.println(now.isAfter(surveyStartDate));
		if(now.isBefore(surveyStartDate) || now.isAfter(surveyEndDate)){
			System.out.println("투표 기간 X");
		}else {
			System.out.println("투표 기간 O");
		}
//		   LocalDate a = LocalDateTime.of(2012, 6, 30, 12, 00);
//		   LocalDate b = LocalDateTime.of(2012, 7, 1, 12, 00);
//		   a.isAfter(b) == false
//		   a.isAfter(a) == false
//		   b.isAfter(a) == true
	}//main

}//class
