package days08;

import java.util.Calendar;

public class Ex05 {

	public static void main(String[] args) {
		// 년도 입력받아서 윤년/평년 체크하는 코딩.
		// 년도를 매개변수로 받아서 윤년/평년 boolean 반환하는 함수	
//		int year =1600;
//		if(isLeapYear(year)) {
//			System.out.println("윤년(leap year)");
//		}else {
//			System.out.println("평년(common year)");
//		}
		//2000~올해 까지 윤년/평년 체크
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR); 
//		System.out.println(c.get(1));
//		System.out.println(Calendar.YEAR); // 1
		for (int i = 2000; i <= thisYear; i++) {
			System.out.printf("%d(%s)\n",i,isLeapYear(i)?"윤년":"평년");
			
		}

	}//main
	//윤년(LeapYear) true 평년(CommonYear) false 
public static boolean isLeapYear(int year) {
	
	if( year % 4 ==0 && year%100 !=0 || year%400==0) {
		return true;
	}else {
		return false;
	}
	
//	태양년 : 1년 365.24219878
	
//	그레고리력의 정확한 윤년 규칙은 다음과 같다.
//
//	서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. (1988년, 1992년, 1996년, 2004년, 2008년, 2012년, 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
//	서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. (1700년, 1800년, 1900년, 2100년, 2200년, 2300년...)
//	서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. (1600년, 2000년, 2400년...)
//	즉, 400년에 97년은 윤년이 되며, 1년은 평균 365.2425일이 된다. 이는 춘분점을 기준으로 한 태양년보다 0.0003일(26초)이 길기 때문에, 약 3,300년마다 1일의 편차가 난다.

}
}
