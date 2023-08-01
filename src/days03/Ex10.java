package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 4:14:53
 * @subject (시험) 연산자를 사용해서 수식으로 표현
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// 1) x는 10보다 크다 		
		//           x > 10;

		// 2) x는 10보다 크고, 20보다 작다.
		//       x > 10 && x < 20
		
		// 3) x는 2의 배수이다.
		//     x % 2 == 0
		
		// 4) x는 2의 배수 또는 3의 배수이다.
		//    x%2 ==0 || x%3 == 0
		
		// 5) x는 2의 배수이지만 6의 배수는 아니다.
		//   x%2 ==0 && !(x%6 ==0)
		
		// 6) 한 문자(ch)가 숫자이다.
		//    '0' ~ '9'
		// char ch == '1';
		//  ch == '0' || ch == '1' ||~ ch =='9';
		// '0'                        '9'
		// 48 <= ch && ch <=57
		// '0' <= ch && ch <='9' ***
		
		// 7) 한 문자가 소문자이다.
		// 97(a)~120(z)
		// 97 <= ch && ch <=120
		// 'a' <= ch && ch <='z' ***
		
		// 8) 한 문자가 알파벳이다 (대문자이거나 또는 소문자)
		// 65 <= ch && ch <=120
		// 'a' <= ch && ch <='z' || A' <= ch  &&  ch <='Z'	
		// 'A' <= ch  &&  ch <='z'
		
		char ch = 66;
		System.out.println('a' <= ch && ch <='z' || 'A' <= ch  &&  ch <='Z');
				System.out.println( 'A' <= ch  &&  ch <='z');																				
		
	}//main

}//class
