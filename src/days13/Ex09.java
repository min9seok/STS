package days13;

public class Ex09 {

	public static void main(String[] args) {
		// 클래스 복사 ( copy )
		
		// 클래스 복제 ( clone )
		//    얉은 
		//    깊은
		
		Point p = new Point();
		//객체명.필드명
		//객체명.메서드명
		p.x = 100;
		p.y = 200;
		System.out.println(p.x );
		// 클래스 복사 (동일한 인스턴스 참조)
		Point pcopy = p;
		pcopy.x =1;
		System.out.println(p.x);
		
		// 클래스 복제
		Point pclone = new Point();
		pclone.x = p.x;
		pclone.y = p.y;
		System.out.println(p.x);
	}//main

}
