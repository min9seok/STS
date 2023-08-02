package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오전 10:35:43
 * @subject 두 기억공간의 값을 바꾸기 시험2번 문제
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		//두 정수를 저장할 x,y 변수를 선언하고
		// 각각 10, 20 으로 초기화하고 
		//출력형식 : > x=10, y=20 출력 ....
		//int x; 
		//int y;
		//동일한 자료형인 경우 ,사용해서 나열할 수 있다.
		int x,y; 
		x = 10;
		y = 20;
		System.out.println("교환전> x="+x+", y="+y);
		System.out.printf("교환전> x=%d, y=%d\n",x,y);
		//프로그램 상에서 두 기억공간의 값을 교환하려면
		//반드시 동일한 자료형의 임시기억공간이 필요하다.
		{
		int temp;
		temp = x;
		x = y;
		y = temp;
		}
		System.out.println("교환후> x="+x+", y="+y);
		System.out.printf("교환후> x=%d, y=%d",x,y);
	}//main
}//class
