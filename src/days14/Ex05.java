package days14;

public class Ex05 {

	public static void main(String[] args) {
		/*
		[ 시험3] this 키워드 설명
		1. 정의 : 객체 자기 자신의 주소값을 가지는 참조변수
		2. this  3가지 용도
		   1) 멤버를 가리킬 때의 this(this.필드명(this.name) this.메서드명 )
		   Point (int x , int y) 
				this.x = x;
				this.y = y;
				
		   2) 생성자에서 또 다른 생성자를 호출할 때의 this
		   3) 단독으로 사용될 때의 this : 리턴값, 매개변수   		
			*/	
//              Point p1 = new Point(1,2);
//              p1.printPoint();
//		
//              Point p2 = new Point(100,200);
//              p2.printPoint();
              
              Point p3 = new Point();
              p3.printPoint();
		
		
		
		
		
		
	}//main

}
