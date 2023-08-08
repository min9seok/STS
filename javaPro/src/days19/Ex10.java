package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		
		// 정규표현식 (Regular Expression) == 정규식
		// String              regex
		// - 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해서 사용
		// - 미리 정의된 기호
		// - 자바 정규표현식과 관련 클래스 2개
		// String.matches(regex)
		// 1) Pattern 
		// 2) Matcher
		String [] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc", "fx"};
		// 1) data 배열에 들어있는 단어 중 c로 시작하는 단어 모두 찾아 출력
		// data[i].startsWith("c")
		// data[i].matches(regex)
		// Pattern p = Pattern.compile(regex); Matcher m = p.matcher(data[i]); m.matches()
//		String regex = "c.*";
//		String regex = "c[a-zA-Z]*"; // c시작 + 영문자 0개이상
//		String regex = "c[a-z]"; // c시작 + 소문자 1개
		
//		String regex = "c\\w"; // \w == [a-zA-Z0-9]
//		String regex = ".*"; // 모든문자
//		String regex = "c.*t";
//		String regex = "c\\d"; // \d == [0-9]
//		String regex = "c\\D"; // \D == [^0-9] 숫자가 아닌것 == c[^0-9] ^가 [] 안에 있으면 부정의 뜻

//		String regex = "(b|c).*"; 
//		String regex = "(bc).*"; b 또는 c
//		String regex = "(bcd).*"; // b 또는 c 또는 d == b-d까지
//		String regex = "(bcd).{2}"; // 2개 
//		String regex = "(bcd).{3}"; // 3개
//		String regex = "(bcd).+"; // 1개 이상
//		String regex = "(bcd).?"; // 0개 또는 1개
		
		String regex = "[a-zA-Z&&[^b-d]].*"; // 대소문자 중에 bcd 제외 아무거나 + 0개이상
		
		
		// \\s 공백 \\S 공백이 아닌것   대문자는 소문자 기능의 부정
		
		Pattern p = Pattern.compile(regex);
		
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if( m.matches()  ) {
				System.out.println(data[i]);
			}
		} //for
	}//main

}//class
