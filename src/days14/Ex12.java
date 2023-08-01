package days14;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 *  클래스들 간의 관계
		 *  1. has-a 포함관계 
		 *  2개의 클래스 선언
		 *  Car
		 *  Engine - 연료 , 구동장치 
		 *  Car has-a Engine 
		 *  
		 *  2. is-a ( 상속 )
		 * */
		Engine engine = new Engine();
		Car myCar = new Car();
		// DI 2가지 방법
		// 생성자 ,
//		Car myCar = new Car(engine); // 의존성 주입 DI
// 		setter 
		myCar.setEngine(engine);
		
		
		
		myCar.speedUp(10);
		int carSpeed = myCar.getEngine().speed;
		System.out.println(carSpeed);
		myCar.speedDown(10);
		 carSpeed = myCar.getEngine().speed;
		 System.out.println(carSpeed);
		 myCar.stop();
		 carSpeed = myCar.getEngine().speed;
		 System.out.println(carSpeed);		 
		 System.out.println("end");
	}//main

}//class
