package days05;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// 1~10 합 for
		//[문제] 두 정수 n, m 을 입력받아서
		// 두 정수 사이의 합을 출력.
		// 예) 2,5     2+3+4+5= ?
		int n,m;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
//		[1]
//		if(n>m) {
//			for(int i = m;  i<= n; i++) {
//				sum+=i;
//				System.out.print(i==m?i:i+"+");
//			}	
//		}else {
//			for(int i = n;  i<= m; i++) {
//				sum+=i;
//				System.out.print(i==m?i:i+"+");
//			}
//		}
		
//		[2]
//		if(n>m) {
//			int temp;
//			temp = n;
//			n = m;
//			m = temp;			
//		}
//		for(int i = n;  i<= m; i++) {
//			sum+=i;
//			System.out.print(i==m?i:i+"+");
//		}
		
//		[3]
//		int min = n > m?m:n;
//		int max = n > m?n:m;
//		for(int i = min;  i<= max; i++) {
//			sum+=i;
//			System.out.print(i==m?i:i+"+");
//		}
		
//		[4] Math클래스 - 수학관련된 메서드(기능)
//		Math.random()
//		Math.min(m, sum)
//		Math.max(m, sum)
		int min = Math.min(n,m);
		int max = Math.max(n,m);
		for(int i = min;  i<= max; i++) {
			sum+=i;
			System.out.print(i==m?i:i+"+");
		}
		System.out.println("="+sum);		
//		int i;
//		int sum=0;
//		for(i=1; i<=10; i++) {
//			sum+=i;
//			System.out.print(i==10?i:i+"+");
//		}
//		System.out.println("="+sum);		
	}

}
