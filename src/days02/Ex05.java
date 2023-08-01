package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오전 11:04:43
 * @subject 표준 입력, 표준 출력 => System 클래스 필요
 * @content 객체==개체==Object==클래스==물건
 *                System 클래스 안에 [표준 출력 함수]
 *                1.println() 출력후 개행 void	println​(boolean x)
 *                2.printf(); PrintStream	printf​(Locale l, String format, Object... args)
 *                3.print(); void	print​(int i)
 *                
 */
public class Ex05 {
	public static void main(String[] args) {
		//java.lang 패키지 안에 있는 System 클래스
		// 함수(메서드) 3가지 파악 => 정확히 사용할 수 있다. 시험3번문제
		// 1. 함수의 기능(일) 파악
		// 2. 함수가 일처리를 할때 필요한 값 (매개변수 , 파라미터 , 인자 , 인수)
		// 3.	함수가 일처리를 한 후에 반환(리턴)하는 값 파악
		//main() 함수 
		// 1.기능 ? 프로그램 시작, 종료
		// 2. 매개변수? String[] ( []붙으면 문자열 배열) args = arguments =인자들
		// 3. 리턴값 X , 리턴자료형 void 선언
		//System.out.printf("홍길동").print("20");
		System.out.println("홍길동");
		System.out.println("이창익");
		System.out.println("이준희");

		//개행방법 
		System.out.print("홍길동" + '\n');
		System.out.print("이창익\n");
		System.out.print("이준희");
		System.out.println(); //개행
		System.out.print("송해영");

		
		
		
		
		
	}//main
}//class
