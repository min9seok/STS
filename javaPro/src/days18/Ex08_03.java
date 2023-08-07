package days18;

import java.nio.file.attribute.AclEntry;
import java.util.Arrays;
import java.util.Iterator;

public class Ex08_03 {

	public static void main(String[] args) {
		
		String s = "안녕하세요. 입니다. 입니다. 입니다.";
		String name = "홍길동";		
//		int index = s.indexOf("입니다"); 
//		s = s.substring(0,index) +name +s.substring(index);
//		System.out.println(index); // 7
//		String ss[] = s.split(" ");
//		s = s.substring(0,17) + name + ss[ss.length-1];		
//		System.out.println(s);
		// (문제)
		// 마지막 "입니다." 찾아서 그 앞에 "홍길동" 
//		s = s.substring(0,17) +name +s.substring(17);
//		System.out.println(s);
		
//		String sArr[] = s.split("입니다");
//		System.out.println(Arrays.toString(sArr));
		
//		int index = s.lastIndexOf("입니다");
//		System.out.println(index);
//		s = s.substring(0,index) +name +s.substring(index);
//		System.out.println(s);
		
//		int fromIndex = 0;
//		int index = s.indexOf("입니다",fromIndex);
//		System.out.println(index);
//		fromIndex = index + "입니다".length();
//		    index = s.indexOf("입니다", fromIndex);
//		System.out.println(index);
		int fromIndex = 0;
		int index  = -1;
		while((index = s.indexOf("입니다",fromIndex) )!= -1 ) {
			System.out.println(index);
			fromIndex = index + "입니다".length();
		}
//		메서드 indexOf()
//		매개변수 String target , String sw, int no
//		리턴값 int index

		"abc".toUpperCase(); // "ABC"
		"ABC".toLowerCase(); // "abc"
		
//		String [] "홍길동,김길동,이길동".split(regex);
		
		String nameArr[] = "홍길동,김길동,이길동,박길동".split(",", 2);
		for(int i=0; i< nameArr.length; i++) {
			System.out.println(nameArr[i] + i);	
		}		
		
	}//main

}//class














