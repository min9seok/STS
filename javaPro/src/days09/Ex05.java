package days09;

import java.util.Arrays;

/**
 * @author minseok
 * @date 2023. 7. 25. - 오후 4:29:35
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
//		 배열 + 제어문
//		 1. 자료형
//		    기본형(8가지)
//		     ㄴ 숫자형
//		         ㄴ정수형
//						ㄴ 문자
//					ㄴ숫자형
//				ㄴ논리형
//		     참조형 - [배열], 클래스, 인터페이스
//		2. 정의 - 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것
//        array
//		3. 배열 선언
//		 		자료형[] 변수명, 참조변수, 배열명;
//			예) int [] m;
//			동적영역(heap)    ,                 스텍(stack)
//		   lowerbound   upperbound
//		      첨자값 == index
//		     0요소   1요소    2요소
//			[4byte][4byte][4byte]			[0x100 주소값    ]
//			 0x100					              m		
//			배열 생성
//		m = new int[3]
//		4. 배열크기 = 배열명.length
//       upperbound(윗첨자값) = 배열명.length-1
//		 lowerbound(아랫첨자값) = 0
//		5. 예)
		int kors[] = new int[3];
		//100점으로 초기화(설정)
//		for (int i = 0; i < kors.length; i++) {
//			kors[i] = 100;
//		} // for
//		Arrays 클래스 - 배열을 사용하기 쉽도록 기능(함수)이 구현된 클래스
//		1) Arrays.toString(kors);
//		2) Arrays.fill(kors, 100);
//		java.lang.NullPointerException
		kors = null ;
		dispKors(kors);
		
		
	}//main

	private static void dispKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d]=%d\n",i,kors[i]);
		} // for
	}
}
