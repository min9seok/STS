package days04;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오후 5:11:05
 * @subject
 * @content
 */
public class Ex10_04 {

	public static void main(String[] args) {
		// 가위(1),바위(2),보(3)
		// 컴퓨터는 1~3 임의의 수를 발생
		// 사용자는 1~3 정수를 Scanner 입력.
		int com , user;
		try (Scanner sc = new Scanner(System.in) ) {
			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");				
			//final String regex = "[0-9]+";			
			while (!sc.hasNextInt()) { //값이 숫자인지 판별
                sc.next();  //값이 숫자가 아니면 버린다.
                System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
 }
			int input = sc.nextInt();			
			com = (int)(Math.random()*3)+1;
			user = input;
			// 입력값에 대한 유효성 검사...
			//user = input.matches(regex);
//			String rps[] = new String[4];
//			rps[0] = "";
//			rps[1] = "가위";
//			rps[2] = "바위";
//			rps[3] = "보";
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
		} catch (Exception e) {
			e.printStackTrace(); e.getMessage();
		}		

	}

}
