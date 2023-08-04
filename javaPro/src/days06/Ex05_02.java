package days06;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 20. - 오후 12:06:50
 * @subject 제어문 활용 
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int n=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("> 정수(n) 입력 ? ");
			String input = sc.nextLine();
			char idArr[] = input.toCharArray();							
			// 정규 표햔식 (regular experssin )
			// 0~9 숫자로만 이루어진 문자열 체크하는 정규표현식
			//String regex = "^[0-9]+$";
			String regex = "^\\d+$";			                     
			boolean flag = input.matches(regex);
						
			if(flag) {
				n = Integer.parseInt(input);
				System.out.println( n );
				
			}else {
				System.out.println("입력 잘못!!!");
			}
//			while(!sc.hasNextInt()) {
//				sc.next();
//				System.err.print("다시 입력하세요 ");
//			}					 		
			//비밀번호 8~15 , 숫자 1 , 알대1, 알소1 , 특수문자1
			
		} catch (Exception e) {
			e.printStackTrace();	
		}

	}

}
