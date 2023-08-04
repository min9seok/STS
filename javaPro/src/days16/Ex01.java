package days16;

public class Ex01 {

	public static void main(String[] args) {

//	Parent p1 = new Child();
		//No enclosing instance of type Ex01 is accessible. Must qualify the allocation with an enclosing instance of type Ex01 (e.g. x.new A() where x is an instance of Ex01).
	//Child c1 = new Descendant();
	Parent p1 = new Descendant();
	}//main
// 상속계층도
// 자식클래스
// 공통적인 멤버 가진 부모클래스, abstract - 추상 클래스
// 일종의 클래스
}//class
abstract class Parent{
	// 필드
	// 메서드
	// 추상메서드
	abstract void dispA();
	abstract void dispB();
}
abstract class Child extends Parent{

	@Override
	void dispA() {		
		
	}
	// 필드
	// 메서드
}
class Descendant extends Child{

	@Override
	void dispB() {
		
	}
}
//abstract class Child extends Parent{
//		// 필드
//		// 메서드
//}
//class Child extends Parent{
//
//	@Override
//	void dispA() {		
//	}
//
//	@Override
//	void dispB() {
//	}
//	// 필드
//	// 메서드
//}