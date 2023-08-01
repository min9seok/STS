package days04;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오후 4:17:56
 * @subject 컴퓨터 - 사용자(user) 가위,바위,보 게임 
 * @content
 */
public class Ex10_03 {
	public static void main(String[] args) {
		// 가위(1),바위(2),보(3)
		// 컴퓨터는 1~3 임의의 수를 발생
		// 사용자는 1~3 정수를 Scanner 입력.
		int com , user;
		try (Scanner sc = new Scanner(System.in) ) {
				System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");				
				//final String regex = "[0-9]+";	
				int input = sc.nextInt(); 
				com = (int)(Math.random()*3)+1;
				user = input;
				// 입력값에 대한 유효성 검사...
				//user = input.matches(regex);
String user1 ="";
String com1 = "";
if(com==1) {
	com1 = "가위";
}else if(com==2) {
	com1 = "바위";
}else if(com==3) {
	com1 = "보";
}
if(user==1) {
	user1 = "가위";
}else if(user==2) {
	user1 = "바위";
}else if(user==3) {
	user1 = "보";
}				
				System.out.printf("> 컴퓨터:%d, 사용자:%d\n",com,user);
				System.out.printf("> 컴퓨터:%s, 사용자:%s\n",com1,user1);
				
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
