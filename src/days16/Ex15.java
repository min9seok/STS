package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author user
 * 개발자가 강제로 예외 발생시키기
 *  1. new 예외 클래스()
 *  2. throw 문 사용해서 예외를 발생
 *  
 *  예 ) 국어점수 입력받아서 수-가 등급 처리
 *    0<= ~ <=100 점수 범위가 벗어나면 예외 발생 처리
 */
public class Ex15 {

	public static void main(String[] args) {
		try {
			int kor = getScore();
			System.out.println(kor);	
		} catch (InputMismatchException e) {
		System.out.println(e);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 예외 발생 유무 상관없이 처리할 코딩
		}
		System.out.println(" end ");

	}//main

	private static int getScore() throws InputMismatchException {
		
		Scanner scanner = new Scanner(System.in);
		int score;
		
		System.out.print("> 점수 입력 ");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		}else {
			throw new InputMismatchException("> 점수 범위(0~100) 벗어났다 . <");
		}
		return score;
	}

}//class
