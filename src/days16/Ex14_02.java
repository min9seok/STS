package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author user
 * 멀티 catch 
 */
public class Ex14_02 {

	public static void main(String[] args) {
		int a =0, b=0;
		double c=0.0;
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		try {
			System.out.print("> a, b 두 정 수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a / b;
			System.out.printf("%d / %d = %.2f\n",a,b,c);
			System.out.println(" 정상 종료 ");
		} catch (InputMismatchException | ArithmeticException  e) {
			System.out.println(" [1]\n" +e.toString());
			System.out.println(" [2]\n" +e.getMessage());
		} catch (Exception e) { //매개변수 다형성
			e.printStackTrace();
		} finally {
			// 예외 발생 유무 상관없이 처리할 구문
			System.exit(-1);
		}	


		
//		String input = "1 fish 2 fish red fish blue fish";
//	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//	     System.out.println(s.nextInt());
//	     System.out.println(s.nextInt());
//	     System.out.println(s.next());
//	     System.out.println(s.next());
//	     s.close();
		

	}//main

}//class
