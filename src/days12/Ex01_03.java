//package days12;
//
///**
// * @author minseok
// * @date 2023. 7. 28. - 오전 10:18:32
// * @subject
// * @content
// */
//public class Ex01_03 {
//
//	public static void main(String[] args) {
//		int m[][] = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}
//		};
//<<<<<<< HEAD
//		int n[][] = new int[2][6];
//		
//		// 2차원 > 1차원 > 2차원 
////		int i = 4*행+열;
////		(4*행+열)/6 (4*행+열)%6;
//		
//		for (int i = 0; i < m.length; i++) {			
//			for (int j = 0; j < m[i].length; j++) {
//				   n[1][i+j] = m[i][j];
//				   System.out.printf("[%d][%d]",n[1][i+j]);
//			} // for
//		} // for
////	  	  00 00
////	      01 01
////        02 02        
////        03 03
////        
////        10 04
////        11 15        
////        12 10
////        13 11
////        
////        20 12        
////        21 13
////        22 14
////        23 15
//        
//	}//main
//
//=======
//		int n[] = new int[m.length*m[0].length];
//		int nn[][] = new int[2][6];
//		
//		// 2차원 > 1차원 > 2차원 
////		int i = 4*행+열;
////		(4*행+열)/6 (4*행+열)%6;
//		
//		for (int i = 0; i < m.length; i++) {			
//			for (int j = 0; j < m[i].length; j++) {
//				n[m[0].length*i+j]=m[i][j];
//			} // for
//		} // for
//		for (int i = 0; i < n.length; i++) {
//			nn[i/6][i%6] = n[i];
//		} // for
//		dispM(m);
//		dispM(n);
//		dispM(nn);
//	}//main
//	private static void dispM(int[] n) {
//		for (int i = 0; i < n.length; i++) {
//			System.out.printf("[%d]",n[i]);
//		} // for
//		System.out.println();
//	}
//	private static void dispM(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				System.out.printf("[%02d]",m[i][j]);				
//			} // for
//			System.out.println();
//		} // for
//		
//	}
//>>>>>>> refs/remotes/origin/master
//}//class
