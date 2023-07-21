package days06;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		int code ;
//		Syntax error on token "continue", invalid VariableDeclaratorId
//		예약어 -> 변수명 사용 X
		char con = 'y';
		do {
			System.out.print("> 한 문자 입력 ? ");
			code = System.in.read();
			System.out.printf("code = %c\n",(char)code);
			System.in.skip(System.in.available()); 
			System.out.print("\n\n 계속할거냐? ");
			code = System.in.read(); // 'y' 'n'			
			con = (char)code;
			System.in.skip(System.in.available());
		} while (con == 'y' || con == 'Y');
		
		System.out.println(" end ");

	}

}
