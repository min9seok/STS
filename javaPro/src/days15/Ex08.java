package days15;

public class Ex08 {

	public static void main(String[] args) {
//		[1]
//		Employee emp1 = new Employee("이준희","서울 강남구","010-1234-1234","2022.12.12");
//		emp1.dispEmpinfo();
//		// Object.toString() > Overriding
//		System.out.println(emp1.toString());
//		//객체명만 있다면 .toString이 생략되어 있다
//		System.out.println(emp1);
		
		//[2]
//		Regular emp2 = new Regular("주강민", "서울 양천구", "010-3212-1522", "2022-03-21", 4000000);
//		// 문제점 : 기본급 출력 X
//		emp2.dispEmpinfo();
//		System.out.println(emp2); // @toStirng()
		
		
		//[3]
		// 상속 조건
		//부모 emp2 = new 자식 
		// 업캐스팅(upcasting) 상속관게 있는 클래스간 형변환
		// 이상한점 기본급 출력
		// Employee 클래스 dispEmpinfo() X
		// 실제 생성된 Regular 객체 dispEmpinfo() 호출
//		Employee emp2 = new Regular("주강민", "서울 양천구", "010-3212-1522", "2022-03-21", 4000000);
//		emp2.dispEmpinfo();
		//업캐스팅 문제점 자식에 선언한 것 사용 불가
//		emp2.getPay();
		//다운캐스팅(downcasting)
		// 업캐스팅 한 객체만 가능 강제 형변환 필수
//		Regular emp = (Regular) emp2; 
		
		//Type mismatch: cannot convert from Employee to Regular
		// cast 는 클래스 형변환 에도 사용 가능
		// java.lang.ClassCastException
//		Regular emp1 = (Regular) new Employee("이준희","서울 강남구","010-1234-1234","2022.12.12");

		//[4] SalesMan , Regular , Employee
//	    Employee emp3 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
//		emp3.dispEmpinfo();
//		System.out.println(emp3.getPay()); // Employee 상태 호출 안됨
		
		//[5]
//		Employee emp4 = new Temp("박정호", "서울 목동", "010-2319-3422","2020.01.01", 20, 250000);
//		emp4.dispEmpinfo();
//		System.out.println( emp4.getPay() ); // X
		
		
		
	}//main

}//class
