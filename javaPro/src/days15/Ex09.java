package days15;

public class Ex09 {

	public static void main(String[] args) {
		
		// 1) 문제점
		// Employee emp1  = new Regular()
		// Employee emp1  = new Temp()
		// Employee emp1  = new SalseMan()
		// emp1.getPay(); 없음
		// 왜 Employee 클래스 안에 getPay() 메서드 선언을 하지 않았나
		// => E + getPay();
		
		//다형성 - 여러가지 형태를 가질 수 있는 능력
		/* Employee emp1  = new Regular()
		    Employee emp2  = new Temp()
		    Employee emp3  = new SalseMan()		  
		 */
		//Cannot instantiate the type Employee
		// 불완전클래스 == 추상클래스 new 로 객체 생성 할 수 없음
//		Employee emp1 = new Employee("이준희","서울 강남구","010-1234-1234","2022.12.12");
		
//		Regular emp1 = new Regular("주강민", "서울 양천구", "010-3212-1522", "2022-03-21", 4000000);
//		SalesMan emp2 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
//		Temp emp3 = new Temp("박정호", "서울 목동", "010-2319-3422","2020.01.01", 20, 250000);
//		
//		emp1.getPay();
//		emp2.getPay();
//		emp3.getPay();
		
//		Employee emps[] = new Employee[3];
//		// 업캐스팅 (자동형변환)
//		emps[0] = new Regular("주강민", "서울 양천구", "010-3212-1522", "2022-03-21", 4000000);
//		emps[1] = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
//		emps[2] = new Temp("박정호", "서울 목동", "010-2319-3422","2020.01.01", 20, 250000);
		
		// 클래스 배열 초기화
		Employee emps[] = {
				new Regular("주강민", "서울 양천구", "010-3212-1522", "2022-03-21", 4000000),
				new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000),
				new Temp("박정호", "서울 목동", "010-2319-3422","2020.01.01", 20, 250000)
		};
		
		for(int i=0; i<emps.length;i++) {
			emps[i].getPay();
		}
		
		
		
		
		
	}//main

	// 사원 급여 출력메서드
	public void dispGetPay() {
		
	}
}//class
