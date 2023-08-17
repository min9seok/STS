package days25;

import java.sql.Date;
import java.util.Scanner;



public class Ex04 {

	public static void main(String[] args) {
		
		// 어노테이션 Annotation
		/*
		 * 1. 사전적 의미 : 주석
		 * 2. 프로그램의 소스 코드 안에 다른 프로그램을 위한 미리 약속된 형식을 포함시킨 것
		 * 3. jdk 에서 기본적으로 제공하는 어노테이션을 표준 어노테이션이라 한다.
		 * 4. 표준 어노테이션 > 컴파일러에게 코드작성 문법 에러를 체크하도록 정보 제공(다른 프로그램)
		 * 5. 표준 어노테이션
		 * 1) @Override 컴파일러에게 오버라이딩한 메서드임을 알려준다
		 * 2) @SuppressWarnings 컴파일러의 특정 경고메시지가 나타나지 않게 사용
		 * 3) @Deprecated 앞으로 없어질 생성자,필드,메서드
		 * 4) @FunctionInterface 함수형 인터페이스를 알려주는 어노테이션 ( 람다식 ) 
		 * 5) @SafeVarargs 제네릭 타입 가변인자에 사용되는 어노테이션
		 * 6) @Native "native 메서드"에서 참조되는 상수앞에 붙인다. C언어 메서드
		 * 6. 메타 어노테이션 - 어노테이션에 사용되는 어노테이션
		 * 1) @Target
		 * 2) @Documented
		 * 3) @Inherited
		 * 4) @Retantion
		 * 5) @Repatable
		 */
		
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);		
		String name = "홍길동";

		
	}//main

	@Override
	public String toString() {
		return "Ex04 []";
	}

}//class
