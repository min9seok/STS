package days11;

/**
 * @author minseok
 * @date 2023. 7. 27. - 오후 3:33:21
 * @subject 다차원 배열은 배열의 배열이다.
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
//		int m[][] = new int[2][4];
//		
//		System.out.println(m.length); // 행
//		System.out.println(m[0].length); // 열
//		System.out.println(m[1].length); // 열
		
		// 2차원 배열 초기화
//		int m[][] = new int[][] {
//			{1,2,3,4},
//			{5,6,7,8}
//		};
		int m[][] = {
			{1,2,3,4},
			{5,6,7,8}
		};
		
		dispM(m);
		
	}//main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ",i,j,m[i][j]);
			} // for
			System.out.println();
		} // for
		
	}

}//class
