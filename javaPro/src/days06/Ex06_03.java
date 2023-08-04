package days06;

import java.util.Iterator;

/**
 * @author minseok
 * @date 2023. 7. 20. - 오후 2:15:24
 * @subject
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
//		[1] 가로 구구단 출력
//		for (int dan = 2; dan <=9; dan++) {
//			for( int i=1;i<=9;i++) {
//				System.out.printf("%d*%d=%02d ",dan,i,dan*i);
//			}
//			System.out.println();
//		} // for

//		[2] 세로 구구단 출력
			for(int i=2; i<=9;i++) {
				System.out.printf(" [%d]단\t" , i);
			}
			System.out.println();
		for (int dan = 1; dan <=9; dan++) {
			for( int i=2;i<=9;i++) {				
				System.out.printf("%d*%d=%02d\t ",i,dan,dan*i);			
			}
			System.out.println();
		} // for
	}

}
