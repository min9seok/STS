package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 4:44:02
 * @subject
 * @content
 */
public class Ex17 {
	public static void main(String[] args) throws IOException {
		//이름, 국어, 영어, 수학을 입력받아서  
		//총점, 평균을 계산하고 
		//[출력형식]
		//박민석님은 국:89 영:78 수:56 총점:000 평균 :00.00 이다.
		String name;
		byte kor,eng,mat;
		short sum;
		double avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 :");
		name = br.readLine();
		System.out.print("국어 :");
		kor = Byte.parseByte( br.readLine());
		System.out.print("영어 :");
		eng = Byte.parseByte( br.readLine() );
		System.out.print("수학 :");
		mat = Byte.parseByte( br.readLine() );	    	    
		sum = (short) (kor+eng+mat);
		avg  = (double) (sum/3);		
			
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균: %.2f 이다.",name,kor,eng,mat,sum,avg);
	
	}//main
}//class
