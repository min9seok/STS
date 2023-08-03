package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int a =0, b=0;
		double c=0.0;
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		// JVM의 예외처리기에 의해서  InputMismatchException 예외 객체 생성 > 개발자 파악 처리
		try {
			System.out.print("> a, b 두 정 수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a / b;
			System.out.printf("%d / %d = %.2f\n",a,b,c);
			System.out.println(" 정상 종료 ");
			// 다중 catch 문
			// 주의 사항 부모 예외 클래스들 밑에 코딩한다.
			// JDK 1.7 ~ 멀티 catch 문
		} catch (InputMismatchException e) {
			System.out.println("> [알림] 정수만 입력 하세요.. ");
//			System.exit(-1);
		} catch (ArithmeticException e) {
			System.out.println("> [알림] 0으로 나눌 수 없습니다.. ");
//			System.exit(-1);
		} catch (Exception e) { //매개변수 다형성
			e.printStackTrace();
//			System.exit(-1);
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
