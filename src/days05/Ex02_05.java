package days05;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오전 11:16:30
 * @subject 4일차 복습 6번문제
 * @content
 */
public class Ex02_05 {

	public static void main(String[] args) {
		char one;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("한 문자 입력 ? ");
			String inputData = sc.next();
			String regex = "[!-)]";
//			String regex = "[#@$!]";
			
			System.out.println(regex);
			System.out.println(inputData);
			System.out.println(inputData.matches(regex));
			if(inputData.matches(regex)) {
				System.out.println("특수문자");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
