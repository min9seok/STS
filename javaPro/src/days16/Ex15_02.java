package days16;

import java.io.BufferedReader;
import java.io.IOException;
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
public class Ex15_02 {

	public static void main(String[] args) {
		
//		BufferedReader br;
//		br.readLine();
		
		// [checked 예외] > 예외처리
		// Unhandled exception type IOException
		// public abstract int read() throws IOException
//		System.in.read();
		
		// unchecked 예외 RuntimeException 상속
		// checked 예외 Exception 상속 
//		int kor = getScore();
//		System.out.println(kor);
		
		
		
//		try {
//			int kor = getScore();
//			System.out.println(kor);	
//		} catch (InputMismatchException e) {
//		System.out.println(e);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			// 예외 발생 유무 상관없이 처리할 코딩
//		}
//		System.out.println(" end ");
//
	}//main
//
	private static int getScore() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int score;
		
		System.out.print("> 점수 입력 ");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		}else {
			throw new IOException("> 점수 범위(0~100) 벗어났다 . <");
		}
		return score;
	}

}//class
