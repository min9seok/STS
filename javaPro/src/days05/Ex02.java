package days05;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오전 11:16:30
 * @subject 4일차 복습 6번문제
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		char one;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("한 문자 입력 ? ");
			String inputData = sc.next();
			one = inputData.charAt(0);
			if('0' <=one && one<='9') {
				System.out.println("숫자 입니다");
			}else if('a' <=one && one<='z') {
				System.out.println("소문자 입니다");
			}else if('A' <=one && one<='Z') {
				System.out.println("대문자 입니다");
			}
			else if('ㄱ' <= one && one <='힣') {
				System.out.println("한글 입니다");
			}
			else if(one =='!' || one =='@' || one =='#' || one =='$') {
				System.out.println("특수문자 입니다");
			}else {
				System.out.println("알수 없는 문자 입니다");	
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
