package days07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 이등변 삼각형 행 갯수 ? ");
		int row = sc.nextInt();
		int col = 2*row-1;
		for(int i =1; i<=row;i++) { //입력값의 해당하는 행 까지 
			System.out.printf("%02d :",i);
			for(int j=1;j<=col;j++) { //별과 공백을 찍는 
				if(i+j>=row+1  && j-i<=row-1) { // i+j 가  입력값+1보다 크거나 -1보다 작으면 *					
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
//		11 12 13 14 15 16 17	
//		21 22 23 24 25 26 27	
//		31 32 33 34 35 36 37
//      41 42 43 44 45 46 47
//		51 52 53 54 55 56 57
//		61 62 63 64 65 66 67
		// Stinrg.repeat();
//		for(int i=1; i<=4; i++) {
//		System.out.println("*".repeat(1));
//		}
	}

}
