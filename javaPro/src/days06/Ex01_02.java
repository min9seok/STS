package days06;

import java.util.Arrays;
import java.util.Random;

public class Ex01_02 {

	public static void main(String[] args) {
		// [문제] 10 개 정수를 임의의 값(5~15)으로 저장 - > 가장큰 값		
		//5 <= (int)(Math.random()*11)+5 <16
//		   0<= rnd.nextInt(100) < 100		
		
		
		int m[] = new int[10];
		Random rnd = new Random();
		for(int i=0; i <m.length; i++) {
//		m[i] = (int)(Math.random()*11)+5;
			m[i] = rnd.nextInt(11)+5;
		}		

//		m 배열의 각 요소를 출력
		System.out.println(Arrays.toString(m)); //배열을 사용하기 쉽도록 구현된 클래스
//	    배열 값 비교하여 조건 값으로 계속 업데이트 시키는 것 		
//		max = m[0];
//		min =  m[0];
		int max , min;
		max = min = m[0];
		for(int i=1; i < m.length; i++) {
			if(max < m[i]) {
			max = m[i];			
			} // 큰값 업데이트
			else if(max > m[i]) {
				max = m[i];			
				} // 작은값 업데이트  
		}
		System.out.println(max + " / " + min);
	}

}
