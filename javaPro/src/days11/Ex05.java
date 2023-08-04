package days11;

import java.util.Arrays;

/**
 * @author minseok
 * @date 2023. 7. 27. - 오후 12:28:02
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		int m[] = {3,5,2,4,1};
//		bubbleSort(m);
		
		// 선택정렬
//		selectionSort(m);
		selectionSort2(m);
		
		// 삽입정렬
		// 병합정렬
		
	}//main
	//[시험]
	private static void selectionSort2(int[] m) {
		// [0]     1    2    3    4 index
		//  3     5    2    4     1 element
		// i=0 선택
		// 0>1 [0>2] 0>3 [0>4]
		System.out.println("시작 " +Arrays.toString(m));
		for (int i = 0; i <m.length-1; i++) {
			int minIndex = i;			
			for (int j = i+1; j < m.length; j++) {					
				if(m[minIndex] > m[j]) {
					minIndex =j;
				}
			} // for
			int temp = m[i];
			m[i] = m[minIndex];
			m[minIndex] = temp;
			System.out.println(Arrays.toString(m));

		} // for
	}
	public static void selectionSort(int[] m) {
		//  0     1    2    3    4 index
		// [1]   [2]  [3]  4    5 element
		//[선택]
		// 0-1 0-2 0-3 0-4 > 1  5  3  2  4    1회전
		// 1-2 1-3 1-4       [1] [2] 5  4  3    2회전      
		// 2-3 2-4            [1] [2] [3]5  4    3회전
		// 3-4                 [1][2][3] [4]  5   4회전               
		for (int i = 0; i <m.length-1; i++) {
			for (int j = i+1; j < m.length; j++) {
				System.out.printf("%d-%d  ",i,j);				
				if(m[i]>m[j]) {
					System.out.print(" *** ");
					int temp =m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m));
			} // for								
				System.out.println();
		} // for
		
		
	}
	public static void bubbleSort(int m[]) {
//		0-1 1-2 2-3 3-4   1회전 
//		0-1 1-2 2-3        2회전
//		0-1 1-2              3회전
//		0-1                    4회전
		
//		i=1 j=0,1,2,3
//		i=2 j=0,1,2
		
//		0 1 2 3            1회전 
//		0 1 2               2회전
//		0 1                  3회전
//		0                     4회전
//		a>b 오름차순 (ascending) 12345
//		a<b 내림차순 (descending) 54321
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j <=4-i; j++) {
				System.out.printf("%d-%d  ",j,j+1);
				if(m[j] > m[j+1]) {
					System.out.print(" *** ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			} // for								
				System.out.println();
		} // for
		
	}
}//class
