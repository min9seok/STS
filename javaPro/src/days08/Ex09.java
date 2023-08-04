package days08;

import java.util.Random;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오후 3:03:14
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 로또 6/45
		// 1~45 정수를 6개 출력
		//	1 <=	Math.random()*45+1 < 46
//		(int)(Math.random()*45)+1);
		
		Random rnd = new Random();
//		rnd.nextInt(45)+1;
		
		for (int i = 0; i <=6; i++) {
			int lottoNumber = (int)(Math.random()*45)+1;
			
			System.out.println( lottoNumber);
			
		} // for
		
		
		
	}//main

}
