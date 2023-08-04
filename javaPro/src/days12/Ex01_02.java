package days12;

/**
 * @author minseok
 * @date 2023. 7. 28. - 오전 10:05:00
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {		
		int m[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
			};
		dispM(m);
		int n[] = new int[m.length*m[0].length];
//		00 > 0
//		01 > 1
//		02 > 2
//		03 > 3
//		10 > 4
//		11 > 5
//		12 > 6
//		13 > 7
//		20 > 8

//		열갯수 * 행갯수 + 열갯수 = 인덱스

//		4 * 행갯수 + 열갯수 = 인덱스
//		1차원 배열 값 = 2차원 배열 열크기*행+열 값 

		for (int i = 0; i < m.length; i++) {			
			for (int j = 0; j < m[i].length; j++) {
				n[m[0].length*i+j]=m[i][j];
			} // for
		} // for
		dispM(n);
	}//main

	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]",n[i]);
		} // for
		System.out.println();
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);				
			} // for
			System.out.println();
		} // for
		
	}

}//class
