package days15;

import java.util.Arrays;
import java.util.Iterator;

import days14.Point;

public class Ex01 {
	public static void main(String[] args) {
//		8.   [취업 문제] ego(자아)
		  String n = "keNik";   
		  String m= "kKnie";		  
		  char []narr = n.toUpperCase().toCharArray();
		  char []marr = m.toUpperCase().toCharArray();
		  Arrays.sort(narr);
		  Arrays.sort(marr);
		  n = String.valueOf(narr);
		  m = String.valueOf(marr);
		  System.out.println(n.equalsIgnoreCase(m));
//		  char nArr[] = n.toCharArray();
//		  Arrays.sort(nArr);
//		  System.out.println(Arrays.toString(nArr));
//		  char mArr[] = m.toCharArray();
//		  Arrays.sort(mArr);
//		  System.out.println(Arrays.toString(mArr));
//		  n = String.valueOf(nArr);
//		  m = String.valueOf(mArr);
//		  System.out.println(n+ "  /  "    +m);
//		  System.out.println(n.equalsIgnoreCase(m));
//		  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
//		  결과는 같을 경우 true/ 다를 경우 false 로 출력.
//		  조건) 대소문자는 구분하지 않는다.  

//	      n = n.toUpperCase().chars().sorted()
//	            .collect(StringBuilder::new,
//	                StringBuilder::appendCodePoint,
//	                StringBuilder::append)
//	        .toString();
//	      
//	      m = Stream.of(m.toUpperCase().split(""))
//	                .sorted()
//	                .collect(Collectors.joining());
//	      
//	      System.out.println(n+"/"+m);
//	      System.out.println( n.equals(m));
		
		
	}//main
}//class

