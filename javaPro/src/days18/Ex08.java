package days18;

public class Ex08 {

	public static void main(String[] args) {
		// 문자열 다루는 클래스
		// String : 변경 불가능한 클래스
		// StringBuffer
		// StringBuilder
		// StringTokenizer
		
		String name = "홍길동"; // new String("홍길동");
		name += "님";
		name += " 안녕!!";
		System.out.println(name);
		
		// 1.
		System.out.println(name.length()); // 9
		// 2.
		for(int i=0; i<name.length(); i++) {
			System.out.printf("name[%d]='%c'\n",i,name.charAt(i));
		}
		// 3.
		String rrn = "890223-1700001";
		System.out.println(rrn.substring(rrn.length()-1)); // "1"
		System.out.println(rrn.substring(7)); // 1700001
		System.out.println(rrn.substring(0,2)); // 89
		// 4. 정규식 패턴 일치 여부 체크 : String.matches()
		String regex = "\\d{6}-\\d{7}";
		System.out.println(rrn.matches(regex));
		// 5. concat()
		String a = "ㅁㅁㅁ" + "ㅠㅠㅠ" + "xxx";
		String b = "ㅁㅁㅁ".concat("ㅠㅠㅠ").concat("xxx");
		// 6. 
//		Stream stream =  rrn.chars();
		// 7.int 0 동일한 문자
		// "A" 65 "a"97 -32
		// "a" 97 "A"65  32
		System.out.println("kEnik".compareTo("kenik"));
		System.out.println("kEnik".compareToIgnoreCase("kenik"));
		// 8. true false
		System.out.println("kenik".equals("kEnik"));
		System.out.println("kenik".equalsIgnoreCase("kEnik"));
		// 9.
		boolean result = "안녕하세요. 홍길동입니다".contains("김길동");
		System.out.println(result);
		// 10.
		String url = "http://www.naver.com/test.jsp";
		String suffix = ".jsp"; // 접미사
		String prefix = "http://"; // 접두사
		System.out.println(url.startsWith(prefix));
		System.out.println(url.endsWith(suffix));
		// 11.   
		
		
		
		
//		int m[] = {3,5,2,4,1};
//		System.out.println(m.length);
	}//main

}//class
