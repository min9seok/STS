package days21;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02 {

	public static void main(String[] args) {

//		5. 개강일(2023.7.13)로부터 100일 되는 날짜를 출력하세요. 
//		 1) Date 클래스 사용
//		Date d = new Date(2023-1900, 7-1, 13);
//
//				(1)d.setDate(13+100);
//				(2)d.setDate(d.getDate()+100);
//				System.out.println(d.toLocaleString());
//
//		 2) Calendar 클래스 사용
//		Date d = new Date(2023-1900,07-1,13);
//				Calendar c = Calendar.getInstance();
//				d.setDate(13+100);
//				 c.setTime(d);
//				System.out.println(c.getTime().toLocaleString());
//				(이게 정답이지 형변환을 하면 안되니까)
//				Calendar c = new GregorianCalendar(2023, 7-1, 13);
//				c.add(Calendar.DATE,100);
//		 3) LocalDate 클래스 사용
//		   LocalDate ld = LocalDate.of(2023,7,13);
//					(1)ld = ld.plusDays(100);
//					(2)ld = ld.plus(100,ChronoUnit.DAYS);
//					System.out.println(ld);

	}//main

}//class
