package days05;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오전 11:27:01
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [문제] 한 라인에 10개씩 출력.
		// [문제] 라인번호를 붙이자.
		//ASCII 256가지
		// ASCII 10 개해 '\n' LineFeed( LF ) 새줄이동
		// ASCII 13 개행 '\r' CarrageReturn ( CR ) 
		// 엔터 == 개행 == '\r\n'
//		for ( int i = 0, lineNumber = 1; i < 256; i++) {
////			if(i%10==0 && i != 0) {
//			if(i%10==0) {				
////				System.out.printf("%d : ",i/10+1);
//				System.out.printf("%d : ",lineNumber++);
//			}							
//			System.out.printf("[%c]",(char)i);
//			if(i%10==9) {
//				System.out.println();
//			}
//		}
//		라인을 10개씩 나누어서 엔터시마다 출력하도록
		Scanner sc = new Scanner(System.in);
		String input = "";			
		int i;		
		for(i =0; i<256; i++) {			
			if(i%10==0 && i != 0) {
				input = sc.nextLine();	
			}
//			if(i%10==0) {			
//				System.out.println();				
//			}
			System.out.printf("[%c]",(char)i);
		}		
		
		
		}
	}