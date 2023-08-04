package days17;

public class Ex01 {

	public static void main(String[] args) {

		/*
		* 1. 자바의 자료형(기본형8가지,참조형:배열,클래스,인터페이스)
		 * 2. 변수 선언  자료형 변수명;
		 *                인터페이스 객체
		 *                   클래스  객체
		 *                   배열  배열명[]
		 * 3. 일종의 추상클래스이다.
		 * 4. 필드 선언이 없다 , 일반 메서드 선언이 없다
		 *     상수,추상메서드 선언 가능 + JDK1.8(static 메서드 , default 메서드)
		 * 5. 인터페이스 끼리 상속이 가능
		 * 6. 인터페이스 사용하면 다중 상속 가능
		 * 7. 인터페이스 구현시 implements 사용해서 클래스 선언
		 * 8. 인터페이스 내부 필드(상수) public static final + 필드 
		 *                                  public abstract + 추상 메서드
		 *                                  */
		
		/* 인터페이스의 장점
		 * 1. 개발 시간 단축
		 *  이유 인터페이스 작성 + 사용하는 곳 > 개발진행
		 *       인터페이스를 구현한 클래스 X
		 * 예) has-a 관계 : Car , Engine 클래스
		 * Car 클래스 코딩~~
		 *  ㄴ Engine 클래스 구현 X
		 *  Engine 인터페이스 구현 클래스 - H_Engine , K_Engine
		 *   [1] 인터페이스 매개변수 다형성
				Engine engine = new K_Engine2();
				Engine engine = new H_Engine();
				Car myCar = new Car(engine);

		 * 2. 표준화가 가능하다.
		 *  Engine 인터페이스 구현해서 클래스를 만들었다면 표준화... 되어져 있다
		 *  
		 * 3. 서로 상속관계 관련없는 클래스들에게 인터페이스로 관계를 맺어 줄 수 있다. 
		 * 				public class ArrayList<E> extends AbstractList<E>
		        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		List l = new ArrayList();

				public class Vector<E>
			    extends AbstractList<E>
			    implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		List v = new Vector();

		test03(l);
		test03(v);
		 * 4. 독립적인 프로그래밍이 가능하다.
		 */
		
		// default 메서드
	
				
				// 1) 여러 인터페이스를 구현하면 디폴트 메서드 충돌. > 충돌나는 디폴트 메서드를 오버라이딩한다.
				// 2) 조상클래스의 메서드와 디폴트 메서드 충돌 > 충돌나는 디폴트 메서드는 무시가 된다.
		
		/*
		 * 1. 프로그램 오류 ? 프로그램 오작동 또는 비정상 종료되는 원인
		 * 2. 오류의 발생 시점 1+2 = 빌드 오류
		 *    1) 컴파일 오류 int i =10 
		 *    2) 런타임 오류 int m[] = null; m[0] =100;
		 *    (1) 에러(error) : 메모리 부족, 스텍오버플로워, 복구할 수 없는 심각한 오류 
		 *    Error 클래스 - 자식 클래스 [ ~~~ Error ]
		 *    (2) 예외(Exception) : 수습될 수 있는 비교적 덜 심각한 실행 오류
		 *    Exception 클래스 - 자식 클래스
		 *    3) 논리적 오류 ( 오류잡기 가장 어렵다 ) int a = Integer.MAX_VALUE; int b = a+100; System.out.println(b);
		 */
		
	}//main

}//class
