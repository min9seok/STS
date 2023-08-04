package days03;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오전 11:48:47
 * @subject
 * @content
 */
public class Ex03 {	
		public static void main(String[] args) throws IOException{
			String name;
			int age;
			int kor;
			int eng;
			int mat;
			int total;
			double ang;			
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 나이 국어 영어 수학 입력 ? ");
			name = sc.next();  
			age = sc.nextInt();  
			kor = sc.nextInt();   
			eng = sc.nextInt();   
			mat = sc.nextInt();  
			total = kor+eng+mat;
			ang = total/3;
	      System.out.printf("\"%s\" %d살 %d %d %d %d %.2f",name,age,kor,eng,mat,total,ang);
	}//main
}//class
