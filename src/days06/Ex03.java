package days06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
//		int a;		
//		for(a='A'; a<='z'; a++) {
//			System.out.printf("%1$c(%1$03d)",a);	
//			if(!Character.isAlphabetic(a)) {
//				continue;
//			}
//			if (a%10==0) {
//				System.out.println();
//			}
//		}
for (int i= 'A', count =1, line=1,aa=0; i <= 'z'; i++) {
	if(i > 'Z' && i < 'a') continue;
	if (count %10==1) System.out.printf("%d : ",line++);	
	System.out.printf("%1$c(%1$03d)",i);	
	aa++;
	if (count++ %10==0) System.out.println();
	if(i == 'Z' ) {
		System.out.println();
		count=1;
	}
	if (line==2) {
		System.out.print("계속하려면 아무키나 누르세요"+line);
		String input = sc.nextLine();
	}
	if( i == 'z') {
		System.out.println();
		System.out.println("종료");
	}
	
}

	}

}
