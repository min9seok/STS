package days08;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오전 11:10:43
 * @subject 7일차 복습 피보나치 문제
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int firstTerm =1;
		int secondTerm =1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+",firstTerm,secondTerm);
		
		for (int i = 1; i <=8; i++) {
			nextTerm = firstTerm + secondTerm;
			System.out.printf("%d+",nextTerm);
			sum += nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;						
		}	
		System.out.printf("=%d\n",sum);

	}

}
