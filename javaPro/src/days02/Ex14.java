package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 3:30:36
 * @subject
 * @content
 */
public class Ex14 {
	public static void main(String[] args) {
		//float f; // [[0][00000000 8지수] 00000000000000000000000 23 가수] 32bit
	    //double d; // [[0][00000000000 11지수]0000000000000000000000000000000000000000000000000000 52 가수] 64bit
		//10 -> 00001010
		//-10 -> 11110110
		// 'A' -> 65 - > 00000000 01000001
		//9,1234567 실수
		//1001.00011110101010010101001........
		//1.XXX * 2^n 정규화
		// 모든 실수 자료형 double 기본으로 사용하자.
		float PI = 3.14f;
		//float PI = (float) 3.14;
		//double PI = 3.14;
		System.out.printf("PI = %f",PI);
	}//main
}//class
