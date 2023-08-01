package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author minseok
 * @date 2023. 7. 26. - 오후 4:43:21
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// max 최고값이 얼마이고, 인덱스 출력.
		int score[] = new int[20];
//		Random rn = new random();		
		//0 ~100 임의의 수
		for (int i = 0; i < score.length; i++) {			
			score[i] = (int)(Math.random()*101);			
			
		} // for				
		int max, min;	
		min = max = score[0];
		int sum = score[0];
		for (int i = 0; i < score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}else if(min >score[i]) {
				min = score[i];
			}
			sum += score[i];
		} // for
		
		//스트림
//		max = IntStream.of(score).max().getAsInt();
//		min = IntStream.of(score).min().getAsInt();
//		sum = IntStream.of(score).sum();
//		double avg = IntStream.of(score).average().getAsDouble();
		
		// 출력.
		System.out.println(Arrays.toString(score));
		System.out.println("max = "+max+" min = "+min);		
		System.out.println("sum = "+sum);
		// avg = (double)sum/score.length;


	}//main

}
