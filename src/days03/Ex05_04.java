package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 2:01:29
 * @subject 논리연산자
 * @content 참 or 거짓 boolean 
 *                1) 일반 논리 연산자 
 *                &&(일반 논리 AND 논리곱) 
 *                ||(일반 논리 OR 논리합) 
 *                !(부정(NOT)연산자)
 *                2) 비트 논리 연산자 & ^ | ~ 
 */
public class Ex05_04 {
	public static void main(String[] args) {
		
		//연산자 우선 순위 ex) * > + 
		// 산술 > 비교 > 논리 > 대입
//		System.out.println( 3 <= 5 && 10 > 1);
//		System.out.println( 3 <= 5 && 10 < 1);
		
		//Dead code  코드가 있지만 동작하지 않는다.
//		System.out.println( 3 >= 5 && 10 > 1);
//		System.out.println( 3 >= 5 && 10 < 1);
		
		//Dead code  코드가 있지만 동작하지 않는다.
//		System.out.println( 3 <= 5 || 10 > 1);
//		System.out.println( 3 <= 5 || 10 < 1);
		
//		System.out.println( 3 >= 5 || 10 > 1);
//		System.out.println( 3 >= 5 || 10 < 1);
		
		//The operator ! is undefined for the argument type(s) int
		// !부정 연산자는  int 피연산자에 사용할 수 없다. !boolean
		// !부정 연산자는 단항 연산자로 어떤 연산자보다 우선 순위가 높다.
		System.out.println( !(3 <= 5) );
		
				
	}//main
}//class
