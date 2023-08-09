package days20;

import java.text.ChoiceFormat;

/**
 * @author user
 * Choiceformat
 */
public class Ex09 {

	public static void main(String[] args) {
		// 특정 범위에 속하는 값을 문자열로 변환
		// 불연속적인 범위의 값을 처리시 if ,switch문 대신 사용 가능 > 복잡한 처리를 간단한 코딩으로 처리 가능
		//예) 국어점수 > 수 우 미 양 가
		
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
//		double[] limits = {0, 60, 70, 80, 90}; // 작은 값부터
//		String[] formats = {"기", "양", "미", "우", "수"};
//		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		
		int kors[] = {100, 67, 23, 99};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d->%s 등급\n",kors[i],cf.format(kors[i]));
		} //for
		
		
		
	}//main
}//class
