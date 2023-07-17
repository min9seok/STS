package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 4:41:16
 * @subject (시험) 인덱스(Index) 연산자 설명 ***
 * @content           []
 */
public class Ex11 {

	public static void main(String[] args) {
		// 1. 국어점수를 저장할 변수를 선언.
		// int kor;
		// 참조형 : 베열, 클래스, 인터페이스
		// 1. 배열 정의 동일한 자료형을 메모리 상에 연속적으로 놓이게 한것
		// 2. 배열 선언 형식
		//    자료형 [] 배열명 = new 자료형[배열크기];
		//lowerBound upperBound
		// 2. 국어점수를 5만명 저장할 변수를 선언.
		 int [] kors = new int[5];
		 //int  kors[] = new int[5];
		 System.out.println(kors.length); //배열크기
		 System.out.println(kors.length -1); //배열크기-1 = 윗첨자값
		 kors[0] = 90;
		 kors[1] = 100;
		 kors[2] = 80;
		 System.out.println(kors[0]);
		 System.out.println(kors[1]);
		 System.out.println(kors[2]);
			
			 
	}//main
	
}//class
