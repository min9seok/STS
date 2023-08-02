package days05;

import java.io.IOException;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오후 4:08:50
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		int code ;
		char one;		
		//[1]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read(); //입력된 한 문자를 INT ASCII 코드로 반환
		System.out.printf("code = %d\n",code);
//		one = (char)code;
//		System.out.printf("code = %c\n",one);
		
//		System.in.read(); //13
//		System.in.read(); //10
//		System.in.skip(?) //숫자 주는만큼 뒤에 짜른다
//		System.in.skip(System.in.available()); // 첫 문자 뺴고 다 자른다.
		//[2]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read(); //입력된 한 문자를 INT ASCII 코드로 반환
		System.out.printf("code = %d\n",code);
//		one = (char)code;
//		System.out.printf("code = %c\n",one);
	}

}
