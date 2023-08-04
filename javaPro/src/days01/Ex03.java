package days01;

/**
 * @author minseok
 * @date 2023. 7. 13. - 오후 3:36:24
 * @subject 자바의 변수와 상수
 * @content 1.변수,상수 개념 설명 2. 변수 선언 형식 3. 예제
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. 변수(variable)
		// 1) 변하는 수 (수학 의미)
		// 2) 메모리상의 값을 저장하는 공간 (프로그램 언어)

		// 2. 상수(const)
		// 1) 고정된 수 (수학 의미)
		// 2) 메모리상의 값을 저장하는 공간 (프로그램 언어)

		// [선언 형식] 1. 클래스 2.함수(메서드)
		// 3. 변수 선언 형식
		// 1) 자료형 변수형 [=초기값]
		// 자료형 == 데이터 타입(data type)

		// 4. 실습
		// 문자열 == 문자의 나열 "문자열"
		// 자바에서 한 문자 '문'
		// 박민석 변수로 인식을 한다
		// System.out.println(박민석);

		// 이름을 저장하는 문자열변수 선언

		// 변수이름을 명명하는 규칙 p26
		// 문자
		String name = "박민석"; // = 대입(할당)연산자
		System.out.println(name);
		// Duplicate local variable name
		// 로컬 함수가 중복 선언
		name = "이준희"; // = 대입(할당)연산자
		System.out.println(name);

	}// main
}// class
