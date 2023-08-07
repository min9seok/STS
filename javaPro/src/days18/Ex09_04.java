package days18;

public class Ex09_04 {

	public static void main(String[] args) {
		/*
	      문제 설명
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
	      */				
	String answer =	solution(5);
	System.out.println('"'+answer+'"');
	}//main
public static String solution(int n) {
		StringBuffer sb = new StringBuffer();
		
		int a = n/2; // 몫
		for(int i = 0; i<a; i++) {
			sb.append("수박");
		}
		int b = n%2; // 나머지		
		if(b == 1) {
			sb.append("수");	
		}
//		boolean sw = true;
//		for(int i=0; i<n; i++) {
//			if(sw) {
//				sb.append("수");
//			}else {
//				sb.append("박");
//			}
//			sw = !sw;
//		}
		return sb.toString();
}
}//class
