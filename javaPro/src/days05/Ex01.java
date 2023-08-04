package days05;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오전 9:00:42
 * @subject 복습 6번 풀이
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		//한 문자 입력 
//		char one='0';
		String one = "0"; 
		// "abc" > 'a' 변환이 아닌 얻어온다 "a" = 'a'+'\0'
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("> 한 문자 입력 ? ");
			one = sc.next();		
			boolean b = Pattern.matches("^[a-z]*$", one);
			boolean B = Pattern.matches("^[A-Z]*$", one);
			boolean num = Pattern.matches("^[0-9]*$", one);
			boolean han = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", one);
			boolean x = Pattern.matches("^[!-)]*$", one);
			if(b) {
				System.out.println("소문자입니다");
			}else if(B) {
				System.out.println("대문자입니다");
			}else if(num) {
				System.out.println("숫자입니다");
			}else if(han) {
				System.out.println("문자입니다");
			}else if(x) {
				System.out.println("특수문자입니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

