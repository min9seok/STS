package days13;

public class Ex06 {

	public static void main(String[] args) {

		// 좌표점 20개 쓰기 + 읽기
		int x=10,y=20;
		
		dispXY(x,y); // Call by Value

	}//main

	private static void dispXY(int x, int y) {
		
		System.out.printf("> x=%d, y=%d\n",x,y);
		
	}
	//The variable argument type int of the method dispXY must be the last parameter
	// 가변인자 여러 개 사용 X
	// 가변인자는 last parameter 로 선언해서 사용
//	public static void dispXY(int...x,int...y) {
//		
//	}
//	public static void dispXY(int x[],int y[]) {
//		
//	}

}//class
