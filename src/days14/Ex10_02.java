package days14;

public class Ex10_02 {
	
	//인스턴스 변수
	String name = "익명";        //명시적 초기화
	int age =20;                  
	boolean gender = true;    //명시적 초기화
	//클래스 변수                     
	static double rate = 0.05; //명시적 초기화
	
	Ex10_02(){
		this.name = "홍길동";   //생성자 초기화
		this.age = 10;           //생성자 초기화
		this.gender = false;   //생성자 초기화
		
//		this.rate = 0.01;       //생성자 초기화
	}
	{
		// 인스턴스 초기화 블럭
		// 오버로딩된 생성자에서 중복되는 초기화 코딩이 있다면 
		// 그 중복 초기화 코딩을 인스턴스 초기화 블럭으로 따로 선언할떄 사용
	}
	static {
		// 클래스 초기화 블럭
//		객체 생성과 상관없이 프로그램 시작 시 한번 static 초기화 블럭 실행
	}
	public static void main(String[] args) {
		
		System.out.println(Ex10_02.rate);
		
		Ex10_02 obj = new Ex10_02();
		System.out.println(obj.name);
		System.out.println(Ex10_02.rate);		
		/*
		 * 필드(멤버변수) 초기화 방법
		 * 1) 명시적 초기화
		 * 2) 생성자 초기화 
		 * 3) 초기화 블럭 { }	
		 * 1. 인스턴스 초기화 블럭 - 인스턴스변수 초기화
		 * 2. 클래스 초기화 블럭 - 클래스 변수 초기화 
		 * 
		 * */
		
		
		
		
	}//main
}//class
