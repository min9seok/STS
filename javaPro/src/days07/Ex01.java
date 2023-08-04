package days07;

public class Ex01 {

	public static void main(String[] args) {
		//1. 구구단 세로 출력
		//for i=2~9 단
		//for j=1~9
		//i=1 j=1~9
		//i=2 j=1~9
		// 2*1 ~ 2*9
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9;j++) {
//				System.out.printf("%d*%d=%d ",i,j,i*j);				
//			}
//			System.out.println();
//		}
		
		//2.구구단 세로 출력
		//for i=2~9 
		//for j=1~9 단
		//i=1 j=1~9
		//i=2 j=1~9
		// 2*1 ~ 2*9
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9;j++) {
//				System.out.printf("%d*%d=%02d \t",j,i,i*j);				
//			}
//			System.out.println();
//		}
		
		//3. 별찍기
		// 1: __*    i=1 j=2     j=1
		// 2: _***   i=2 j=1     j=3
		// 3: ***** i=3  j=0    j=5
//		for(int i=1;i<=3; i++) {			// 행갯수
//			System.out.printf("%d : ",i);
//			for (int j = 0; j <= 3-i; j++) { //공백 for
//				System.out.print("_");
//			} // for
//			for (int j = 0; j <= 2*i-1; j++) { 	//별 for
//				System.out.print("*");
//			} // for
//			System.out.println();
//		}
		for(int i =1; i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j>=4  && j-i<=2) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
//	11 12 13 14 15	
//	21 22 23 24 25	
//	31 32 33 34 35	
	}
}
