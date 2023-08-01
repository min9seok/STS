package days13;

public class Ex07_03 {

	//                               참조명 매개변수 args
	public static void main(String[] args) {
		
		Point p = new Point();
		p.x=10;
		p.y=20;
		System.out.printf("> x=%d, y=%d\n",p.x,p.y);

		swap(p);
		
		System.out.printf("> x=%d, y=%d\n",p.x,p.y);
	}//main
//	                           메서드의 매개변수 Point p 객체 타입
	//                               참조형 매개변수 p
	private static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y= temp;		
	}

}//class
