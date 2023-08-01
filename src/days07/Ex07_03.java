package days07;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author minseok
 * @date 2023. 7. 21. - 오후 2:28:56
 * @subject
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		// 1+1+2+3+5+8+13+21+34+55+89
		//[문제] 피보나치 수열
		// 항이 100보다 같거나 작을 때 까지의 수열을 출력
		// 합을 구해서 출력
		int a=1;
		int b=1;
		int sum =0;		
		for(int i =0; i<=10; i++) {
			sum = a +b;
			if(sum<=100) {				
				System.out.print(sum+"+");						
			}
			a = b;
			b = sum;

		}
		System.out.println("="+sum);
		
//		int p[] = new int[20]; //AraayList 컬렉션 클래스 배우면 배열크기 신경x
//		p[1] =p[0] =1;
//		int index =2;
//		while(true) {
//			int term = p[index-1] + p[index-2];
//			if( term > 100) break;
//			p[index] = term;
//			index++;
//		}
//		System.out.println(Arrays.toString(p));
//		System.out.println(index -1);
//		// JDK 1.8 람다식과 스트림
//		int sum = IntStream.of(p).sum();
//		System.out.println(sum);
		
//		int firstTerm =1;
//		int secondTerm =1;
//		int nextTerm;
//		int sum = firstTerm + secondTerm;
//		System.out.printf("%d+%d+",firstTerm,secondTerm);
//		// 1+1+
//		//[A]
////		while (true) {
////			nextTerm = firstTerm + secondTerm;
////			if(nextTerm > 100)break;
////			System.out.printf("%d+",nextTerm);
////			sum += nextTerm;
////			firstTerm = secondTerm;
////			secondTerm = nextTerm;						
////		}		
//		//[B]
//		while ((nextTerm = firstTerm + secondTerm)<=100) {
//			System.out.printf("%d+",nextTerm);
//			sum += nextTerm;
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;						
//		}
//		System.out.printf("=%d\n",sum);
	}
}
