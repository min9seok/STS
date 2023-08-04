package days05;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		// 1~10 합 for
		//[문제] 두 정수 n, m 을 입력받아서
		// 두 정수 사이의 홀수 합을 출력.		
		int n,m;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int min = Math.min(n,m);
		int max = Math.max(n,m);
		if(min%2==0) {
			min++;
		}
		for(int i = min;  i<= max; i+=2) {
//			if(i%2!=0) {
//				sum+=i;
//				System.out.print(i==max?i:i+"+");
//			}
			sum+=i;
			System.out.print(i==max?i:i+"+");
		}
		System.out.println("="+sum);		 
	}

}
