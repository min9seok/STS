package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author user
 * 중첩 try- catch 
 */
public class Ex14_03 {

	public static void main(String[] args) {
		int a =0, b=0;
		double c=0.0;
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		try {
			System.out.print("> a, b 두 정 수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			try {
				c = a / b;
				System.out.printf("%d / %d = %.2f\n",a,b,c);	
			} catch (ArithmeticException e) {
			System.out.println(e);
			}					
			System.out.println(" 정상 종료 ");
		} catch (InputMismatchException e) {
			System.out.println(" [1]\n" +e.toString());
			System.out.println(" [2]\n" +e.getMessage());
		} catch (Exception e) { //매개변수 다형성
			e.printStackTrace();
		} finally {
			try {	} catch (Exception e2) {}
			// 예외 발생 유무 상관없이 처리할 구문
			System.exit(-1);
		}	
		

	}//main

}//class
