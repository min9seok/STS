package days07;

/**
 * @author minseok
 * @date 2023. 7. 21. - 오후 4:14:33
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		// 두정수의 합을 구해서 반환하는 sum() 함수 선언
		// 1. sum() 함수 선언
		// 2. sum() 함수 호출
//		int c = a+b;
		//세 정수를 계산 
//		int result = sum(a,b,c);
		int d =40;
		int result = sum(a,b,c,d);
		System.out.printf("%d+%d=%d\n",a,b,c);
		

	}
public static int sum(int a, int b) {	
	return a+b; // 수식 or 값 
}
public static int sum(int a, int b, int c) {	
	return a+b+c; // 수식 or 값 
}
public static int sum(int a, int b, int c, int d) {	
	return a+b+c+d; // 수식 or 값 
}
}
