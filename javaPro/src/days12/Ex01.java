package days12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 28. - 오전 8:50:22
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  }; 
		dispW(m);
		int [][] n = new int[6][2];		
		for (int i = 0; i < m.length; i++) {
			n[i/2][i%2] = m[i];
		} // for
		dispM(n);
		
		
		
		
		
	}//main

	private static void dispM(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("n[%d][%d]=%d ",i,j,n[i][j]);
			} // for
			System.out.println();
		} // for
		
	}

	private static void dispW(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n",i,m[i]);			
		} // for
		
	}
	
}

