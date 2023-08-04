package days06;

import java.util.Iterator;

/**
 * @author minseok
 * @date 2023. 7. 20. - 오후 2:15:24
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		//[2][3][4]
		//[5][6][7]
		//[8][9]
//		int i,dan,j,k;
		for(int k=1;k<=3;k++) {		
		for(int dan=3*k-1; dan<=3*k+1 && dan!=10;dan++) {			
			System.out.printf(" [%d]단 \t" , dan);			
		}
		System.out.println();
		for (int dan = 1; dan <=9; dan++) {
			for(int i = 3*k-1;i<=3*k+1 && i!=10;i++) {						
				System.out.printf("%d*%d=%02d\t",i,dan,dan*i);			
			}
			System.out.println();
		} // for
		System.out.println();
		}						
		
		
		
		
//		int i,dan,j,k;
//		for(k=1;k<=2;k++) {		
//		for(j=4*k-2; j<=4*k+1;j++) {
//			System.out.printf(" [%d]단 \t" , j);
//		}
//		System.out.println();
//		for (dan = 1; dan <=9; dan++) {
//			for(i = 4*k-2;i<=4*k+1;i++) {				
//				System.out.printf("%d*%d=%02d\t",i,dan,dan*i);			
//			}
//			System.out.println();
//		} // for
//		System.out.println();
//		}						
	}

}
