package days16;

import days15.Employee;
import days15.Regular;   // Ctrl + shift + 5
import days15.SalesMan;
import days15.Temp;

public class Ex02 {

	public static void main(String[] args) {
//		Regular e1 = new Regular();
//		dispGetPay(e1);
		SalesMan e2 = new SalesMan();
		dispGetPay(e2);
//		Temp e3 = new Temp();
//		dispGetPay(e3);
		
	}//main
	// 인스턴스 메서드 -> 클래스 메서드 (static)
	// 매개변수 다형성
	public static void dispGetPay(Employee emp) {
		// 인스턴스 확인할 수 있는 연산자 instanceof 상속관계가있는 자식 클래스 먼저
		if (emp instanceof SalesMan) {
			System.out.println("> emp객체는 SalesMan 타입이다. ");
		SalesMan s1 = (SalesMan)emp;
		}else if (emp instanceof Regular) {
			System.out.println("> emp객체는 Regular 타입이다. ");
			Regular r1 = (Regular)emp;
		}else if (emp instanceof Temp) {
			System.out.println("> emp객체는 Temp 타입이다. ");		
		}
	}
}//calss
