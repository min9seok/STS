package days19;

import java.util.Date;

/**
 * @author user
 * 날짜 , 시간 클래스 + 형식화 (fommating)클래스
 *  일정관리
 *  
 *  컬렉션 프레임워크
 *  제니릭 + 어노테이션
 *  자바 입출력(IO)
 *  +
 *  스레드 + 네트워크
 *  람다식 + 스트림
 *  
 */
public class Ex11 {

	public static void main(String[] args) {
		
		// jdk 1.0  java.util.Date
		// jdk 1.1  java.util.Calender - (GregorianCalender)
		// jdk 1.8  java.time 패키지 안에  여러 하위 패키지와 다양한 클래스 추가

		Date d = new Date();
//		System.out.println(d);
		// 그리니치 표준시 세계 표준 시간
//		System.out.println(d.toGMTString());
//		System.out.println(d.toLocaleString());
		
		//년 월 일 시간 분 초 밀리초 요일
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getSeconds()/(double)1000);
//		System.out.println(d.getDay());
		System.out.println("일월화수목금토".charAt(d.getDay()));
		System.out.println(d.getTime());
		
		
	}//main

}//class
