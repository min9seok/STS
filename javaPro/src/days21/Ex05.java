package days21;

import java.time.LocalDate;

public class Ex05 {

	public static void main(String[] args) {
		//날짜와 시간 비교 : isAfter() , isBefore() , isEquals()
		
		// 오늘이 생일이니?
		// 1999.8.10
		// 2023.8.10
		LocalDate today = LocalDate.now();
		
		LocalDate birth = LocalDate.of(1999,8,1);
		birth = birth.withYear(today.getYear());
		System.out.println(birth);
		
		System.out.println(today.isBefore(birth)); //생일 전 compareTo 음수
		System.out.println(today.isEqual(birth)); // 생일   compareTo  0
		System.out.println(today.isAfter(birth)); // 생일 후 compareTo 양수

		System.out.println(today.compareTo(birth));   
		
	}//main

}//class
 