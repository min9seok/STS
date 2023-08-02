package days11;

/**
 * @author minseok
 * @date 2023. 7. 27. - 오후 3:33:21
 * @subject 다차원 배열은 배열의 배열이다.
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		
//		int m[][][] = new int[2][2][2];
//		
//		System.out.println(m.length); // 면
//		System.out.println(m[0].length); // 행				
//		System.out.println(m[0][0].length); // 열		
//		System.out.println(m[1][0].length); // 열
		
		//3차원 배열의 조기화
		int m[][][] = {
				{
					{1,2,3,4},
					{5,6,7,8}
				},
				{
					{11,12,13,14},
					{15,16,17,18}	
				}
				};
		
		dispM(m); //3차원 배열 m 출력하는 함수
		
	}//main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]면\n",i) ;
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d ",i,j,k,m[i][j][k]);
				} // for
				System.out.println();
			} // for
			System.out.println();
		} // for
		
	}


}//class
