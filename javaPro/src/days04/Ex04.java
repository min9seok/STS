package days04;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오전 11:44:37
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//국어 점수를 kor 변수에 입력받아서 등급(grade)을 출력
		// 0~59 가 60~69 양 70~79 미 80~89 우 90~100 수
		try {				
		int kor;
		String grade = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("> 점수 입력 ?  ");
		kor = sc.nextInt();
		if(0<= kor && kor <=100) {
		if(kor <60) {
//		if(kor >=0 && kor <=59) {
			grade = "가";			
		} if(kor <70) {
//		  else if(kor >=60 && kor <=69) {
			grade = "양";			
		} if(kor < 80) {
//		  else if(kor >=70 && kor <=79) {
			grade = "미";			
		} if(kor <90) {
//	      else if(kor >=80 && kor <=89) {
			grade = "우";			
		} if(kor <100) {
//		  else if(kor >=90 && kor <=100) {
			grade = "수";		
		}
		}else {
			System.out.println("국어 점수 입력 잘못!!!");		
		}
		System.out.printf("%s",grade);
		} catch (Exception e) {
			System.out.println("국어 점수 입력 잘못!!!"+e.getMessage());			
			e.printStackTrace(); // 예외 발생위치와 내용을 알려줍니다.    
		}

	}//main

}//class
