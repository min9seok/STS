package days05;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오후 4:03:09
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {

		int n,m;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("> n, m input ? ");
		n = sc.nextInt();
		m = sc.nextInt();
		int min = Math.min(n,m);
		int max = Math.max(n,m);
		if(min%2==0) {
			min++;
		}		
		while(min <= max) {
			sum+=min;
			System.out.printf("%d+",min);
			min+=2;
		}
		System.out.println("="+sum);		 

	}

}
