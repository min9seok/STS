package days16;

public class Ex03 {

	public static void main(String[] args) {
		
		//1. 지역변수 -> 상수 (final)
		FinlaTest obj = new FinlaTest();
		System.out.println(obj.PI);
		//The final field FinlaTest.PI cannot be assigned
		//obj.PI = 3.14;

	}//main

}//class
//class Parent{
//	// 재정의 할 수 없는 최종(마지막) 메서드
//  final void dispA() {
//		
//	}
//}
//class child extends Parent{
////	@Override
////	void dispA() {
////	}
//}
class FinlaTest{
	
	// 상수 필드
//	public static final double PI = 3.141592; // 명시적 초기화
	
	//The blank final field PI may not have been initialized
	final double PI;
	
	//인스턴스 포기화 블럭
//	{
//		PI = 3.14;
//	}
	public FinlaTest() { // 생성자 초기화
		PI = 3.14;
	}
	//int value 지역변수 , 매개변수
	public void finaltest(final int value) {
		//
		//
	}
}