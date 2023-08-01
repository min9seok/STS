package days06;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 20. - 오후 12:06:50
 * @subject 제어문 활용 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		int n=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("> 정수(n) 입력 ? ");
			String input = sc.nextLine();
			char idArr[] = input.toCharArray();
			boolean flag = false; // 숫자가 아닌게 잇으면 -> true
			for (int i = 0; i < idArr.length; i++) {
				if( !('0' <= idArr[i] && idArr[i] <= '9')) {
					flag =true;
					break;
				}
			}
			if(!flag) {
				n = Integer.parseInt(input);
				System.out.println( n );
				
			}else {
				System.out.println("입력 잘못!!!");
			}// for
//			while(!sc.hasNextInt()) {
//				sc.next();
//				System.err.print("다시 입력하세요 ");
//			}
//			n = sc.nextInt();						
 		
		} catch (Exception e) {
			e.printStackTrace();	
		}

	}

}
