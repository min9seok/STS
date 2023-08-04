package days04;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오전 10:52:05
 * @subject 제어문
 * @content 	1. 정의 : 프로그램의 실행 순서를 제어하는 문
		                       (건너띄기 , 반복 처리 등등)
		            2. 종류 : 조건문(if,else),분기문(switch case),반복문(for foreach),조건반복문(do~while),기타 break , continue
 */
public class Ex03 {

	public static void main(String[] args) {
		//condition(조건식) 참/거짓 판가름할 수 있는 식
		//정수를 입력받아서 n 변수에 저장을 하고 출력.
		//(입력값에 대한 유효성 검사 코딩 추가)
		int n;		
		try (Scanner sc = new Scanner(System.in);){
			 System.out.print("> 정수입력 ? ");
			 String a = "^[0-9]*$";
			 int input = sc.nextInt();
			 n = input;		 
			 			 
			 if (n%2 ==0) {
				 System.out.printf("n=%d 짝수",n);	
			}if (n%2 !=0) {
				 System.out.printf("n=%d 홀수",n);				
			}
		} catch (Exception e) {
			System.out.println("dddddddd");
		}		 
		
		
		 
//		if () {
//			//조건식이 참일 때만 {} 수행
//		} //if

	}//main

	private static int input(String a) {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
