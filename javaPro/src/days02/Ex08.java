package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 12:09:53
 * @subject 정수계열(byte(1),short(2),[int(4)],long(8)
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		//1bit = 0,1
		//1byte = 8bit
		// 1bit 정수 표현 가지수 2가지
		// 1byte 정수 표현 가지수 256가지
		//정수유형 + 1byte 크기 할당 : byte 값의 표현 범위 이해 -128 ~ 127		2^7
		//정수유형 + 2byte 크기 할당 : short -32768 ~ 32767 2^15
		//정수유형 + 4byte 크기 할당 : int -21억 ~ 21억 2^31
		//정수유형 + 8byte 크기 할당 : long -900경 ~ 900경  2^63
		
		// 본인의 나이를 저장할 age 변수를 선언하고 
		// 본인 나이로 초기화
		// 출력 코딩 
		
	    byte age;
		age = 27;
	    System.out.println(age);
	
		// 국어 , 영어 , 수학 , 점수를 저장할 변수 선언
		// 0 <= 정수 <=100
	  //  byte kor, eng, mat;
	    //kor = 100;
	    //eng = 100;
	    //mat = 100;
      //   mat = eng = kor = 100;

         //
	}//main
}//class
