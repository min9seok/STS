package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		
		
		int [][] m = new int[5][5];

		   
		   fillM(m); 
		   dispM(m);
		   
//		   [실행결과]    
//			[01][02][03][04][10]
//			[05][06][07][08][26]
//			[09][10][11][12][42]
//			[13][14][15][16][58]
//			[28][32][36][40][136]  
		
	}//main

	private static void fillM(int[][] m) {
		for (int i = 0,n=1; i < m.length-1; i++) {
			for (int j = 0; j < m[i].length-1; j++) {
					m[i][j] =n++;
					m[i][4] += m[i][j];
					m[4][j] += m[i][j];
					m[4][4] += m[i][j];
			} // for			
		} // for
//	      int n = 1;
//	      int row = 0, col = 0;
//	      
//	      while (n <= 25) {
//	         m[row][col++] = n;	         
//	         
//	         if ( col%5==0 ) {
//	        	 n = m[0][0];
//	        	 for(int i=0; i<m.length;i++) {	        		 
//	        		 n += m[row][i];
//	        		 System.out.println(n);
//	        	 }
//	            row++;col=0;
////	         } else {
////	            row--;  col++;
////	            if( col == 5) col=0;
////	            if( row == -1) row=4;
//	         } // if         
//	         n++;
//	      } // while
	      
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
