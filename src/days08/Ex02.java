package days08;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오전 11:10:54
 * @subject 7일차 복습 함수문제
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println( sum(1,2,3) );
		System.out.println( sum(1,2,3,4,5,6) );
		System.out.println( sum(new int[] {1,2}) );
		
		char one = 'x';
		char upperOne = myUpperCase(one);
		System.out.println(upperOne);
		
	}//main
	public static char myUpperCase(char one) {
		
		if('a' <= one && one <='z') {
			one = (char) (one-32);
		}
		
//		if(Character.isLowerCase(one)) {
////			upperCassOne = Character.toUpperCase(one);
//			one = Character.toUpperCase(one);
//		}				
		return one;
	}
	public static int sum(int... args) { //가변인자는 제일 마지막 오로지 하나만 사용
		int result =0;
//		for (int i = 0; i < args.length; i++) {
//			result += args[i];
//		} // for
		for (int i :args) {
			result += i;
		} //foreach
		return result;
	}

}//class
