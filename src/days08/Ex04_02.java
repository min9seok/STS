package days08;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오전 11:11:08
 * @subject 지역변수 개념
 * @content 함수 호출 + 매개변수 가지고
 *                1) call By Name   drawLine();
 *                2) call By value    sum();
 *                3) call By Reference swap();
 *                4) call By Point  C언어에서 사용 JAVA에는 없음
 */
public class Ex04_02 {

	public static void main(String[] args) {
		//main 지역변수  x,y
//		int x =10 , y =20;
		int m[] = {10, 20};
		System.out.printf("> x=%d, y=%d\n",m[0],m[1]);
		
		//call By Value
		//call By Reference main 함수의 x,y 참조
		// 매개변수를 참조타입을 사용하겠다. 배열 클래스 인터페이스
		swap(m); // 함수 호출 부분 0x100 배열 시작주소
		
		System.out.printf("> x=%d, y=%d\n",m[0],m[1]);

	}//main

//함수 선언 부분                      지역변수 0x100
	public static void swap(int m[]) {
		// swap 지역변수 x,y		
		int temp = m[0];
		m[0]= m[1];
		m[1] =temp;						
	}

}
