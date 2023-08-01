package days05;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오후 2:02:07
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [1] 1+2+3...=55
//		int i;
//		int sum =0;
//		for(i=1; i<=10; i++) {
//			sum+= i;			
//			System.out.print(i==10?i:i+"+");			
//		}
//		System.out.println("="+sum);
		
		// [2] 1+3+5+7+9=25
		// 1~10까지의 홀수의 합
//		int i;
//		int sum =0;
//		for(i=1; i<=10; i++) {
//			if(i%2!=0) {
//			sum+= i;			
//			System.out.print(i+"+");
//			}
//		}
//		System.out.println("="+sum);
		
		// [3] 1+3+5+7+9=25
		// 1~10까지의 홀수의 합
		// continue 문 
//		int i;
//		int sum =0;
//		for(i=1; i<=10; i++) {
//			if(i%2 ==0) {
//				continue;
//			}
//			sum+= i;			
//			System.out.print(i+"+");			
//		}
//		System.out.println("="+sum);
		
		//[4]
		int i;
		int sum =0;
		for(i=1; i<=10; i+=2) {			
			sum+= i;			
			System.out.print(i+"+");			
		}
		System.out.println("="+sum);
		
		// [5] 1~n 까지의 합 출력
		// 1+2+3+4+5=15
//		int n = 5;
//		int i;
//		int sum =0;
//		for(i=1; i<=n; i++) {			
//			sum+= i;			
//			System.out.print(i==n?i:i+"+");			
//		}
//		System.out.println("="+sum);
		
		
		
		
	}

}
