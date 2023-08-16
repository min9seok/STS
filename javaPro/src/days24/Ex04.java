package days24;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * 중첩 클래스와 중첩 인터페이스
		 * 1. 클래스와 클래스들 간 관계
		 * has-a, is-a(상속)
		 * 2. 어떤 클래스가 특정클래스와 관계
		 *       A         B
		 *   B라는 클래스 내부에 A 클래스 선언
		 * 3. 중첩 클래스(Nested Class) 
		 * 4. 장점
		 * 1) 두 클래스의 멤버들을 서로 쉽게 접근
		 * 2) 불필요한 관계 클래스를 숨김 (코드의 복잡성 줄임)
		 * 5. ex)
		 *  class A{
		 *  	// 중첩 클래스
		 *  	class B{
		 *  	}
		 *  	// 중첩 인터페이스
		 *  	interface IC{
		 *  	}
		 *  }
		 * 6. 중첩 클래스의 종류 : 선언 위치 구분 
		 *  중첩클래스도 A(외부)$B(내부).class 클래스파일 생성
		 *  1) 클래스의 멤버 선언
		 * class A{		 
		 *      인스턴트 멤버 클래스 - A 객체 생성해야 B 중첩클래스 사용 가능 접근지정자 사용 
		 * 		class B{
		 * 		B() {} 생성자
		 * 		int b1; 인스턴스 필드
		 * 		void test() {} 인스턴스 메서드 
		 *			// static 필드, 메서드 선언할 수 없다
		 *		A a = new A();   
		 * 		A.B b = a.new B();
		 * 		b.b1 = 100;
		 * 		b.test();
		 * 		}
		 *    정적(static) 멤버 클래스 - A 클래스 객체 생성 없이 C 중첩클래스 사용 가능 접근지정자 사용 
		 * 		static clas C{
		 * 			// 모든 필드, 메서드 선언할 수 있다.
		 * 		c(){} 생성자
		 * 		int c1;  인스턴스 변수
		 * 		static sc1;  static 변수
		 * 		void test1(){} 인스턴스메서드
		 * 		static void test2(){} static 메서드
		 * 		A.C c = new A.C();
		 * 		c.c1 = 100;
		 * 		c.test1();
		 * 		A.C.sc1 = 100;
		 * 		A.C.test2();
		 * 		}
		 * }
		 *  2) 메서드의 내부 선언
		 * class A{
		 *  //메서드
		 * 	void disp(){
		 * 		
		 * 		로컬 클래스 - 메서드 실행 시 사용 가능 A(외부)$1B(로컬클래스).class 접근지정자 사용 X
		 * 		class D{
		 * 		D(){} 생성자
		 * 		int d1; 인스턴스 변수
		 * 		void test(){} 인스턴스 메서드
		 * 		static 필드, 메서드는 선언할 수 없다
		 * 		} 
		 *  // 메서드 안에서 로컬 클래스 사용할때
		 * 	D obj = new D();
		 * 	obj.d1;
		 * 	obj.test();
		 * 	}
		 * }
		 * 
		 */
		
		
		
		
		
	}//main
}//class
