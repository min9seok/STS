package days08;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오전 11:11:08
 * @subject 지역변수 개념
 * @content 함수 호출 + 매개변수 가지고
 *                1) call By Name   drawLine();
 *                2) call By value
 *                3) call By Reference
 *                4) call By Point
 */
public class Ex04 {

	public static void main(String[] args) {
		//main 지역변수  x,y
		int x =10 , y =20;
		System.out.printf("> x=%d, y=%d\n",x,y);
		
		//call By Value
		swap(x,y); // 함수 호출 부분
		
		System.out.printf("> x=%d, y=%d\n",x,y);

	}//main

//함수 선언 부분                      지역변수
	public static void swap(int x, int y) {
		// swap 지역변수 x,y
		System.out.printf(">swap bofore x=%d, y=%d\n",x,y);
		int temp = x;
		x= y;
		y =temp;
		System.out.printf(">swap after  x=%d, y=%d\n",x,y);		
		
	}

}
