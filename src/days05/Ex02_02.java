package days05;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오전 10:46:49
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
//		char - > String 변환
//		1) 'a' + ""
//		2) String valueOf('a');
//		3) Character.toString('a');
		
//		 Strubg -> char 변환 X
		String name = "kenik";
//		원하는 위치의 한 문자를 얻어오고 싶다.
//		char 문자열.charAt(index);
		
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
//		System.out.println(name.charAt(3));
//		System.out.println(name.charAt(4));
		int len = name.length();
		for(int i = 0; i < len; i++) {
			System.out.println(name.charAt(i));	
		}
//		문자열 다루는 메서드(함수)
//		1. split()
//		2. length()
//		3. charAt(0)
//		4. valueOf()
//		5. toString()
//		6. toCharArray() String -> char[] 반환하는 메서드(함수)
		

	}

}
