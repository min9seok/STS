package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 5:18:53
 * @subject BufferedReader br을 사용해서 동시에 이,국,영,수 입력 -> 총,평 
 * @content 배열사용
 */
public class Ex12 {
	public static void main(String[] args) throws IOException{
		
		String name;
		int kor,eng,mat,total;	
		double avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//홍길동,90,78,99 엔터
		System.out.print("> 이름,국어,영어,수학 입력 ? ");
		String inputData = br.readLine();
		//System.out.println( inputData ); 
		//"홍길동,90,78,99" 구분자 ,로 잘라내기
		// 1) 기능 2) 매개변수 3) 리턴값(리턴자료형)
		String datas[] = inputData.split(",");
		name = datas[0];
		kor = Integer.parseInt(datas[1]);
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);
		total = kor+eng+mat;
		avg  = total/3;				
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균: %.2f 이다.",name,kor,eng,mat,total,avg);
	}//main
	
}//class
