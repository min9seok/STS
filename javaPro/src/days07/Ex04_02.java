package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) throws IOException {

		int user;			
		Scanner sc = new Scanner(System.in);
		String input;
		String regex = "[1-3]";			                     
		boolean flag;
//		flag = input.matches(regex);
		flag = false;
		int count=0;
		char con = 'y';		
		do {			
			if(flag) {
				count++;
				System.err.print("에러!["+count+"] 숫자만 1,2,3. 재 입력 :\n ");								
			}if(count>=5) {
				System.err.print("에러! 5번 연속으로 틀려 종료합니다 :\n ");
				return;
			}				
		System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");			
		input = sc.next();				
		flag = true;
		}while(!input.matches(regex));						
		user = Integer.parseInt(input);			
		System.out.print(user);				
	}

}

