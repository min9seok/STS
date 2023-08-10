package days21;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex04 {

	public static void main(String[] args) throws ParseException {
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";	
		int no;
		String name;
		String addr;
//		MessageFormat 가 없다면 substring 이용해서 해야함 
//		int index = source.indexOf("이름");
//		System.out.println(index);
		String pattern = "번호:{0},이름:{1},주소:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		Object objArr[] = mf.parse(source);
		no = Integer.parseInt((String) objArr[0]);
		name = (String) objArr[1];
		addr = (String) objArr[2];
		System.out.println(no);
		System.out.println(name);
		System.out.println(addr);
	}//main

}//class
