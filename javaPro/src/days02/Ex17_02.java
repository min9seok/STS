package days02;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 4:44:02
 * @subject  
 * @content Scanner 클래스
 */
public class Ex17_02 {
	public static void main(String[] args) throws IOException {
		//이름, 국어, 영어, 수학을 입력받아서  
		//총점, 평균을 계산하고 
		//[출력형식]
		//박민석님은 국:89 영:78 수:56 총점:000 평균 :00.00 이다.
		String name;
		byte kor,eng,mat;
		short sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 국어 영어 수학 입력 :");
		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();
   	    
		sum = (short) (kor+eng+mat);
		avg  = (double) (sum/3);		
			
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균: %.2f 이다.",name,kor,eng,mat,sum,avg);
	sc.close();
	}//main
}//class
