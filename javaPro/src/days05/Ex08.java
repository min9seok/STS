package days05;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오후 4:47:15
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// https://programmers.co.kr/		
	     Scanner sc = new Scanner(System.in);
	        String str = sc.next();        
	        int n = sc.nextInt();      
	        int len = str.length();
	        System.out.println(len);
	        if(1<= len && len <=10){
	            for(int i =1; i<=5; i++){              
	                System.out.print(str);

	          
	            }
	        }
	}

}
