package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		int com , user;	
		char con = 'y';
		String input;
		String regex = "[1-3]";			                     
		boolean flag;
		int count = 0;
		flag = false;
			try( Scanner sc = new Scanner(System.in)){
			do {
				if(flag) {
					count++;
					System.out.print("a");
				}if(count>=5) {
					System.out.println("ddd");
				}
			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");						
			com = (int)(Math.random()*3)+1;
			input =sc.next();
			user = Integer.parseInt(input);
			String rps[] = {"","가위","바위","보"};			
			System.out.printf("> 컴퓨터:%s, 사용자:%s\n",rps[com],rps[user]);
			switch (user - com) {
			case 1:case -2:		
				System.out.println("사용자 승리");
				break;
			case 2:case -1:
				System.out.println("컴퓨터 승리");
				break;
			default:
				System.out.println("무승부");	
				break;
			}				
			System.out.print("\n\n 계속할거냐? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		}while(Character.toUpperCase(con) =='Y');
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");				


	}
}
