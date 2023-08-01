package days10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		
//		1. 1차원,2차원,3차원 배열( 다차원 배열)
//		2. 정렬(SORT)
//		3. 검색(SEARCH)
//		4. 다차원 활용 예제
		
//		클래스 수업 책 5장 6장 읽어보기
		
		// 문제) int m[] = new int[30] 0~9 정수 임의의 정수
		// 0 - 3개
		// 1 - 0게
		// 9 - 4개
		int m[] = new Random().ints(30, 0,10).sorted().toArray();
		System.out.println(Arrays.toString(m));
		int[] counts = new int[10];
		for (int i = 0; i < m.length; i++) {
			counts[m[i]]++;
		} // for				
		for (int j = 0; j <=9; j++) {			
			 System.out.println(j + "번 : " + counts[j]);

		} // for							  						
	}

}
