package days04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//switch 		
		//key : 변수 수식 (정수 문자열 문자 )
		//value : 리터럴 , 변수 X
		int n;		
		try (Scanner sc = new Scanner(System.in);){
			 System.out.print("> 정수입력 ? ");
			 n = sc.nextInt();
			 String result =null;
		switch(n%2) {
		case 0:
		result = "짝수";
		case 1:
		result = "홀수";
		break;
		//default:
		}
		
		System.out.println(result);
		
		} catch (Exception e) {
		}		
		System.out.println("end");
	}

}
