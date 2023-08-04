package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오전 9:50:36
 * @subject
 * @content p82 코딩 문구 
 */
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("main() 시작");
		otherMethod();
		System.out.println("main() 종료");
		
	}
	
	private static void otherMethod() {
		System.out.println("otherMethod() 시작");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				return;
			}
		}
		System.out.println("otherMethod() 종료");
	}
}
