package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오전 9:00:27
 * @subject 복습 후 제어문
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String name;
//		int kor,eng,mat,total;
//		double avg;
//		System.out.print("> 이름,국,영,수 입력 ? ");
//		String inputData = br.readLine();
//		String datas[];
//		datas = inputData.split("," + " ");
//		String regex = "\\s*,\\s*";  정규식 A whitespace character: [ \t\n\x0B\f\r]  * X, zero or more times
//		String regex = "[, ]";  //[abc] a, b, or c (simple class) 			
//		datas = inputData.split( regex );
//		name = datas[0];
//	    kor = Integer.parseInt(datas[1]);
//		eng =Integer.parseInt(datas[2]);
//		mat = Integer.parseInt(datas[3]);
//		total = kor+eng+mat;
//		avg = (double) total/3;
//		System.out.printf("\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f",name,kor,eng,mat,total,avg);		
//		
//	int x,y,max;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("x,y");	 
//	x = sc.nextInt();
//	y = sc.nextInt();
//	max = (x>y?x:y);
//	System.out.println(max);
		
	double x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();		
		x = (int) (x*100 + 0.5)/100 ;
	System.out.printf("%f",x);
				
	
//		 int  kors[] = new int[5];
//		 //int  kors[] = new int[5];
//		 System.out.println(kors.length); //배열크기
//		 System.out.println(kors.length -1); //배열크기-1 = 윗첨자값
//		 kors[0] = 90;
//		 kors[1] = 100;
//		 kors[2] = 80;
//		 System.out.println(kors[0]);
//		 System.out.println(kors[1]);
//		 System.out.println(kors[2]);
		
		
//		System.out.println(kor[].length);
		
		
		
	}//main


}//class
