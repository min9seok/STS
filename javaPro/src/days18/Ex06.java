package days18;

public class Ex06 {

	public static void main(String[] args) {
		// Object.clone() 복제
		
		Person p1 = new Person("111", "홍길동");
//		p1.clone();
		Person p1Clone;
		p1Clone = p1.clone();
		System.out.println(p1Clone);
//		try {
//			// clone() 오버라이딩 불편한 점
//			// (Person) 다운캐스팅 해야한다.
//			p1Clone = (Person)p1.clone();
//			System.out.println(p1Clone);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		
//		p1.notify();    스레드 수업
//		p1.notifyAll(); 스레드 수업
//		p1.wait();       스레드 수업
//		p1.wait(0);      스레드 수업
//		p1.wait(0, 0);   스레드 수업
		
// 		p1.finalize(); 소멸자 객체가 소멸될때 명령수행

	}//main

}//class
