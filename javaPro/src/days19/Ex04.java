package days19;

import java.util.StringTokenizer;

public class Ex04 {

	public static void main(String[] args) {
//		StringTokenizer 클래스
		String str = "고경림,김성준,김정주,김호영";
		// String [] str.split(regex)
		
		StringTokenizer st = new StringTokenizer(str, ",");
//		System.out.println(st.countTokens());
		int countToken = st.countTokens();
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());		
//		// NoSuchElementException 
//		System.out.println(st.nextToken());
		
//		for (int i = 0; i < countToken; i++) {
//			System.out.println(st.nextToken());			
//		} //for
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());				
		}
		
		
 	}//main

}//class
