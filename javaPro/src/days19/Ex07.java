package days19;

public class Ex07 {

	public static void main(String[] args) {
		// 오토박싱(boxing) 오토언박싱(unboxing)
		int i = 100; //int 변수
		Integer j = i; // Integer  객체 
//		기본형(i) > 객체(j) 변환 오토박싱
		
		//JDK 1.5 이전
//		Integer k = new Integer(i);
		
		int k =j;
//		객체(j) > 기본형(k) 변환 오토언박싱
		
		test(i); // int > Integer 박싱 > Object 업캐스팅
		test(3.14); // 자료형 > 래퍼클래스 박싱 > Object 업캐스팅
		test(1L); // 자료형 > 래퍼클래스 박싱 > Object 업캐스팅
		test('a'); // 자료형 > 래퍼클래스 박싱 > Object 업캐스팅
		test(true); // 자료형 > 래퍼클래스 박싱 > Object 업캐스팅
		test(j); // Integer 클래스  Object[ 업캐스팅]
		test("홍길동"); // String  Object[ 업캐스팅]
		
		
		
		
	}//main
	//Object = 모든 자료형을 매개변수 받아서 처리
	private static void test(Object i) { // Integer > int 형변환 오토언박싱
		System.out.println(i);
		
	}
//	private static void test(int i) { // Integer > int 형변환 오토언박싱
//		System.out.println(i);
//		
//	}
	

}//class


