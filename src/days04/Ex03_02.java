package days04;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		int n;		
		try (Scanner sc = new Scanner(System.in);){
			 System.out.print("> 정수입력 ? ");
			 n = sc.nextInt();
			 String result = "짝수(even number)";
			 if (n%2 ==0) {
			//	 System.out.printf("n=%d 짝수",n);
				 result = "홀수(odd number)";
			 }							
//			 
//			 if (n%2 ==0) {
//			//	 System.out.printf("n=%d 짝수",n);
//				 result = "짝수(even number)";
//			}else {
//			//	 System.out.printf("n=%d 홀수",n);
//				result = "홀수(odd number)";
//			}
			 System.out.printf("n=%d %s",result);
		} catch (Exception e) {
			
		}		

	}//main

}//class
