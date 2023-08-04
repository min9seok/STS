package days11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * @author minseok
 * @date 2023. 7. 27. - 오후 4:42:01
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lottos[][] ;

		System.out.print("> 로또 게임 횟수 입력 ? ");
		int game = sc.nextInt();
		lottos = new int[game][6];		
		int num[] = new int [game];
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(i+1+" 게임 ");		
	      for (int j = 0; j <6; j++) {	    	  
	    	  Random ran=new Random();	    	
//				int lottoNumber = (int)(Math.random()*45)+1;
	    	  num[i] = 	ran.nextInt(45)+1;			
//	    	  if( num[i] == ran.nextInt(45)+1 ) {
//	    		  num[i++] = ran.nextInt(45)+1;
//	    	  }
//	    	  for (int i = 0; i < index; i++) {
//	    	         if( lotto[i] == lottoNumber ) {
//	    	            return true;
//	    	         } // if
//	    	      } // for
				System.out.print("["+num[i]+"]");
			} // for
	      System.out.println();
		} // for
		    

		

	}//main
}
