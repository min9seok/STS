package days20;

import java.text.DecimalFormat;

/**
 * @author user
 *  형식화 클래스 4가지
 *  SimpleDate Format
 *  Decimal 숫자 형식화(내가 원하는 형식)하는 클래스
 *  Choice
 *  Message
 */
public class Ex07 {

	public static void main(String[] args) {
 
//		int money=3257600;
		double money=3257600.8;
		// 출력형식 \3,257,600
		//[1]
//		String strMoney = String.format("\\%,d", money);
//		System.out.println(strMoney);
		//[2]
		// 패턴 사용 기호
		// 0  10진수 값 없는 경우 0
		// # 10진수 
		// - 음수 부호
		// , 단위 구분자
		// E 지수기호
		// ; 패턴구분자
		// % 퍼센트 
		// ' escape문자 
		// \u00A4 통화기호
		
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
	}//main

}//class
